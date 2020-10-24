package com.guiteam.eerem.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.guiteam.eerem.EeremApplication
import com.guiteam.eerem.R
import com.guiteam.eerem.model.User
import com.guiteam.eerem.model.UserDAO
import com.guiteam.eerem.viewmodel.AppDatabase

class LoginActivity : AppCompatActivity() {
    private lateinit var appDatabase: AppDatabase
    private lateinit var userDAO: UserDAO
    private lateinit var usernameET: EditText
    private lateinit var passwordET: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        appDatabase = EeremApplication.database!!
        userDAO = appDatabase.userDAO()

        userDAO.insert(User(1, "ubai", "Fadhli Ubai", "fadhli.ubai@gmail.com", "admin123", "2110181043", "IT", "081252875616"))

        usernameET = findViewById(R.id.usernameET)
        passwordET = findViewById(R.id.passwordET)
        loginButton = findViewById(R.id.loginButton)

        loginButton.setOnClickListener { onLoginButtonClicked() }
    }

    fun onLoginButtonClicked() {
        var username = usernameET.text.toString()
        var password = passwordET.text.toString()

        var foundUser = userDAO.authenticateUser(username, password)

        if(foundUser != null)
            changeActivity()
    }

    fun changeActivity() {
        var intent = Intent(this, DashboardActivity::class.java)
        startActivity(intent)
    }



}