package school.cactus.succulentshop.utils.validators.signup

import school.cactus.succulentshop.R
import school.cactus.succulentshop.utils.extensions.containsValidCharacters
import school.cactus.succulentshop.utils.extensions.isLonger
import school.cactus.succulentshop.utils.extensions.isShorter
import school.cactus.succulentshop.utils.validators.Validator

class UsernameValidator : Validator {

    override fun validate(field: String): Int? = when {
        field.isEmpty() -> R.string.username_is_required
        !field.containsValidCharacters() -> R.string.must_not_consist_characters_err_message
        !field.isLonger(2) -> R.string.username_is_too_short
        !field.isShorter(20) -> R.string.username_is_too_long
        else -> null
    }

}


