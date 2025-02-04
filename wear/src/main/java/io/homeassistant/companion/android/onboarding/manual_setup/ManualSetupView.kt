package io.homeassistant.companion.android.onboarding.manual_setup

import androidx.annotation.StringRes

interface ManualSetupView {
    fun startIntegration(serverId: Int)

    fun showLoading()

    fun showContinueOnPhone()

    fun showError(@StringRes message: Int)
}
