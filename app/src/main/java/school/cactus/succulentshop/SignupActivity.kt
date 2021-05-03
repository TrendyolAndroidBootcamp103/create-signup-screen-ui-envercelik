package school.cactus.succulentshop

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import school.cactus.succulentshop.databinding.ActivitySignupBinding
import school.cactus.succulentshop.utils.extensions.validate
import school.cactus.succulentshop.utils.validators.signup.EmailValidator
import school.cactus.succulentshop.utils.validators.signup.PasswordValidator
import school.cactus.succulentshop.utils.validators.signup.UsernameValidator

class SignupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            buttonSignUp.setOnClickListener {
                textInputLayoutEmail.validate(EmailValidator())
                textInputLayoutUsername.validate(UsernameValidator())
                textInputLayoutPassword.validate(PasswordValidator())
            }

            buttonAlreadyHaveAnAccount.setOnClickListener {
                navigateLoginActivity()
            }
        }
    }


    private fun navigateLoginActivity() {
        val intent = Intent(this@SignupActivity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

}