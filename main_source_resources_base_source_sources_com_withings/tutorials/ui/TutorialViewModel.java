package com.withings.tutorials.ui;

import androidx.lifecycle.g1;
import com.withings.device.Device;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: TutorialViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/tutorials/ui/TutorialViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TutorialViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final u60.a f44699a;

    /* renamed from: b  reason: collision with root package name */
    private final m70.i f44700b;

    /* renamed from: c  reason: collision with root package name */
    private final l2.d f44701c;

    @Inject
    public TutorialViewModel(u60.a featureActivationUseCase, m70.i userManager, l2.d dVar) {
        kotlin.jvm.internal.u.j(featureActivationUseCase, "featureActivationUseCase");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        this.f44699a = featureActivationUseCase;
        this.f44700b = userManager;
        this.f44701c = dVar;
    }

    public final void i0(int i11, Device device) {
        kotlin.jvm.internal.u.j(device, "device");
        this.f44701c.getClass();
        l2.d.b(i11, device);
    }
}
