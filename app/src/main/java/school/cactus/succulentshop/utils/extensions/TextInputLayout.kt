package school.cactus.succulentshop.utils.extensions

import android.content.Context
import com.google.android.material.textfield.TextInputLayout
import school.cactus.succulentshop.utils.validators.Validator

fun TextInputLayout.validate(validator: Validator) {
    val errorMessage = validator.validate(editText!!.text.toString())
    error = errorMessage?.resolveAsString(context)
    isErrorEnabled = errorMessage != null
}

fun Int.resolveAsString(context: Context) = context.getString(this)


