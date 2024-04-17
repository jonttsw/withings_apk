package com.withings.paywall.confirmation;

import androidx.lifecycle.g1;
import androidx.lifecycle.u0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ConfirmSubscriptionViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/paywall/confirmation/ConfirmSubscriptionViewModel;", "Landroidx/lifecycle/g1;", "Landroidx/lifecycle/u0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/u0;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ConfirmSubscriptionViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f43605a;

    @Inject
    public ConfirmSubscriptionViewModel(u0 savedStateHandle) {
        boolean z5;
        u.j(savedStateHandle, "savedStateHandle");
        Boolean bool = (Boolean) savedStateHandle.c("is_success");
        if (bool != null) {
            z5 = bool.booleanValue();
        } else {
            z5 = false;
        }
        this.f43605a = z5;
    }

    public final boolean f0() {
        return this.f43605a;
    }
}
