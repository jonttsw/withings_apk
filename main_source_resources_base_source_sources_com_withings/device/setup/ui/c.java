package com.withings.device.setup.ui;

import android.content.DialogInterface;
import com.withings.devicesetup.network.ui.PickWifiForSetupActivity;
import com.withings.reminder.model.Reminder;
import com.withings.views.view.ToggleCellView;
import com.withings.wiscale2.profile.q;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f37537a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f37538b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f37539c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f37537a = i11;
        this.f37538b = obj;
        this.f37539c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        int i12 = this.f37537a;
        Object obj = this.f37539c;
        Object obj2 = this.f37538b;
        switch (i12) {
            case 0:
                SetupChooseDeviceActivity.z3((SetupChooseDeviceActivity) obj2, (List) obj, i11);
                return;
            case 1:
                ((PickWifiForSetupActivity) obj2).I3((qj.h) obj);
                return;
            case 2:
                bf0.b.U1((bf0.b) obj2, (ToggleCellView) obj, dialogInterface, i11);
                return;
            default:
                q.w1((q) obj2, (Reminder) obj);
                return;
        }
    }
}
