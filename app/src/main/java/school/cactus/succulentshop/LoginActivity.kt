package school.cactus.succulentshop

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import school.cactus.succulentshop.databinding.ActivityLoginBinding
import school.cactus.succulentshop.utils.extensions.validate
import school.cactus.succulentshop.utils.validators.login.IdentifierValidator
import school.cactus.succulentshop.utils.validators.login.LoginPasswordValidator


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = getString(R.string.log_in)

        binding.apply {

            logInButton.setOnClickListener {
                passwordInputLayout.validate(LoginPasswordValidator())
                identifierInputLayout.validate(IdentifierValidator())
            }

            createAccountButton.setOnClickListener {
                navigateSignupActivity()
            }
        }
    }


    private fun navigateSignupActivity() {
        val intent = Intent(this@LoginActivity, SignupActivity::class.java)
        startActivity(intent)
        finish()
    }

}
