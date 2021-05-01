package school.cactus.succulentshop.utils.validators.login

import school.cactus.succulentshop.R
import school.cactus.succulentshop.utils.validators.Validator


class LoginPasswordValidator : Validator {

    override fun validate(field: String) = when {
        field.isEmpty() -> R.string.this_field_is_required
        else -> null
    }

}