package com.example.androidfinal

import android.app.PendingIntent.getActivity
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfinal.databinding.ActivityMainBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.SignInButton
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task


const val RC_SIGN_IN = 123
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var toggle: ActionBarDrawerToggle
//    val signInButton = findViewById<SignInButton>(R.id.signInButton)
//    val tv_name = findViewById<TextView>(R.id.tv_name)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//            .requestEmail()
//            .build()
//        // Build a GoogleSignInClient with the options specified by gso.
//        val mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
//
//
//        signInButton.visibility = View.VISIBLE
//        tv_name.visibility = View.GONE
//
//        signInButton.setSize(SignInButton.SIZE_STANDARD)
//        signInButton.setOnClickListener {
//            val signInIntent = mGoogleSignInClient.signInIntent
//            startActivityForResult(signInIntent, RC_SIGN_IN)
//        }

        binding.apply {
            toggle = ActionBarDrawerToggle(
                this@MainActivity,
                drawerLayout,
                R.string.open,
                R.string.close
            )
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.firstItem -> {
                        startActivity(Intent(this@MainActivity, Bucharest::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }

                    R.id.secondItem -> {
                        startActivity(Intent(this@MainActivity, Iasi::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }

                    R.id.thirdItem -> {
                        startActivity(Intent(this@MainActivity, Targoviste::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }

                    R.id.fourthItem -> {
                        startActivity(Intent(this@MainActivity, Sibiu::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }

                    R.id.fifthItem -> {
                        startActivity(Intent(this@MainActivity, Sighisoara::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }

                    R.id.sixthItem -> {
                        startActivity(Intent(this@MainActivity, Brasov::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }

                    R.id.seventhItem -> {
                        startActivity(Intent(this@MainActivity, Constanta::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }

                    R.id.eighthItem -> {
                        startActivity(Intent(this@MainActivity, Craiova::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                }
                true
            }

        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            true
        }
        return super.onOptionsItemSelected(item)
    }
}
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
//        if (requestCode == RC_SIGN_IN) {
//            // The Task returned from this call is always completed, no need to attach
//            // a listener.
//            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
//            handleSignInResult(task)
//        }
//        val acct = GoogleSignIn.getLastSignedInAccount(this)
//        if (acct != null) {
//            signInButton.visibility = View.GONE
//            tv_name.text = acct.displayName
//            tv_name.visibility = View.VISIBLE
//        }
//    }
//    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
//        try {
//            val account = completedTask.getResult(ApiException::class.java)
//
//            // Signed in successfully, show authenticated UI.
//            signInButton.visibility = View.GONE
//            tv_name.text = account.displayName
//            tv_name.visibility = View.VISIBLE
//        } catch (e: ApiException) {
//            // The ApiException status code indicates the detailed failure reason.
//            // Please refer to the GoogleSignInStatusCodes class reference for more information.
//            signInButton.visibility = View.VISIBLE
//            tv_name.text = ""
//            tv_name.visibility = View.GONE
//        }
//    }
//}
//
