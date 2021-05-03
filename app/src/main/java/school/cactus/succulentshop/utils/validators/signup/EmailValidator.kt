package school.cactus.succulentshop.utils.validators.signup

import school.cactus.succulentshop.R
import school.cactus.succulentshop.utils.Pattern
import school.cactus.succulentshop.utils.validators.Validator

class EmailValidator : Validator {

    override fun validate(field: String): Int? = when {
        field.isEmpty() -> R.string.email_is_required
        !Pattern.EMAIL_ADDRESS.matcher(field).matches() -> R.string.email_is_invalid
        else -> null
    }
}