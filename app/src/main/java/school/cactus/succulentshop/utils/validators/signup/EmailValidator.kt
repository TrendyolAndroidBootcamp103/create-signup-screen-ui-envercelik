package school.cactus.succulentshop.utils.validators.signup

import school.cactus.succulentshop.R
import school.cactus.succulentshop.utils.extensions.isLonger
import school.cactus.succulentshop.utils.extensions.isShorter
import school.cactus.succulentshop.utils.validators.Validator

class EmailValidator : Validator {

    override fun validate(field: String): Int? = when {
        field.isEmpty() -> R.string.email_is_required
        !field.contains("@") -> R.string.email_is_invalid
        !field.contains(".") -> R.string.email_is_invalid
        !field.isLonger(5) -> R.string.email_is_invalid
        !field.isShorter(50) -> R.string.email_is_invalid
        else -> null
    }
}