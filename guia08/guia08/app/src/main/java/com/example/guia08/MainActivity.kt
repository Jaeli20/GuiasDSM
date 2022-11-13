package com.example.guia08

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val txtCodigo=findViewById<EditText>(R.id.txtCodigo)
        val txtNombre=findViewById<EditText>(R.id.txtNombre)
        val txtEdad=findViewById<EditText>(R.id.txtEdad)
        val txtApellido=findViewById<EditText>(R.id.txtApellido)
        val txtTelefono=findViewById<EditText>(R.id.txtTelefono)
        val boton1=findViewById<Button>(R.id.btnAlta)
        val boton2=findViewById<Button>(R.id.btnCodigo)
        val boton3=findViewById<Button>(R.id.btnDescripcion)
        val boton4=findViewById<Button>(R.id.btnCodigoBaja)
        val boton5=findViewById<Button>(R.id.btnModificacion)


        boton1.setOnClickListener {
            val admin = AdminSQLiteOpenHelper(this,"administracion", null, 1)
            val bd = admin.writableDatabase
            val personas = ContentValues()
            personas.put("codigo", txtCodigo.getText().toString())
            personas.put("nombre", txtNombre.getText().toString())
            personas.put("edad", txtEdad.getText().toString())
            personas.put("apellido", txtApellido.getText().toString())
            personas.put("telefono", txtTelefono.getText().toString())
            bd.insert("personas", null, personas)
            bd.close()
            txtCodigo.setText("")
            txtNombre.setText("")
            txtEdad.setText("")
            Toast.makeText(this, "Se cargaron los datos del artículo", Toast.LENGTH_SHORT).show()
        }

        boton2.setOnClickListener {
            val admin = AdminSQLiteOpenHelper(this, "personas", null, 1)
            val bd = admin.writableDatabase
            val fila = bd.rawQuery("select nombre,apellido,edad,telefono from personas where codigo=${txtCodigo.text.toString()}", null)
            if (fila.moveToFirst()) {
                txtNombre.setText(fila.getString(0))
                txtApellido.setText(fila.getString(1))
                txtEdad.setText(fila.getString(2))
                txtEdad.setText(fila.getString(3))
                txtTelefono.setText(fila.getString(4))


            } else
                Toast.makeText(this, "No existe un artículo con dicho código", Toast.LENGTH_SHORT).show()
            bd.close()
        }

        boton3.setOnClickListener {
            val admin = AdminSQLiteOpenHelper(this, "personas", null, 1)
            val bd = admin.writableDatabase
            val fila = bd.rawQuery("select nombre,apellido,edad,telefono from personas where nombre='${txtNombre.text.toString()}'", null)
            if (fila.moveToFirst()) {
                txtNombre.setText(fila.getString(0))
                txtApellido.setText(fila.getString(1))
                txtEdad.setText(fila.getString(2))
                txtEdad.setText(fila.getString(3))
                txtTelefono.setText(fila.getString(4))
            } else
                Toast.makeText(this, "No existe un artículo con dicha descripción", Toast.LENGTH_SHORT).show()
            bd.close()
        }

        boton4.setOnClickListener {
            val admin = AdminSQLiteOpenHelper(this, "personas", null, 1)
            val bd = admin.writableDatabase
            val cant = bd.delete("personas", "codigo=${txtCodigo.text.toString()}", null)
            bd.close()
            txtCodigo.setText("")
            txtNombre.setText("")
            txtEdad.setText("")
            txtApellido.setText("")
            txtTelefono.setText("")
            if (cant == 1)
                Toast.makeText(this, "Se borró el artículo con dicho código", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "No existe un artículo con dicho código", Toast.LENGTH_SHORT).show()
        }

        boton5.setOnClickListener {
            val admin = AdminSQLiteOpenHelper(this, "personas", null, 1)
            val bd = admin.writableDatabase
            val personas = ContentValues()


            personas.put("codigo", txtCodigo.text.toString())
            personas.put("nombre", txtNombre.text.toString())
            personas.put("edad", txtEdad.text.toString())
            personas.put("apellido", txtApellido.text.toString())
            personas.put("telefono", txtTelefono.text.toString())

            val cant = bd.update("personas", personas, "codigo=${txtCodigo.text.toString()}",
                null)
            bd.close()
            if (cant == 1)
                Toast.makeText(this, "se modificaron los datos", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "no existe un artículo con el código ingresado", Toast.LENGTH_SHORT).show()
        }

















    }
}