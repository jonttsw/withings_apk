package com.withings.reminder.details;

import android.content.DialogInterface;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.device.common.setup.PickUserForSetupActivity;
import com.withings.wiscale2.heart.heartrate.x0;
import vh.h;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f43883a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f43884b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f43883a = i11;
        this.f43884b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        int i12 = this.f43883a;
        Object obj = this.f43884b;
        switch (i12) {
            case 0:
                ReminderDetailsActivity.askToSaveChangesBeforeFinishing$lambda$11((ReminderDetailsActivity) obj, dialogInterface, i11);
                return;
            case 1:
                MainActivity.A3((MainActivity) obj);
                return;
            case 2:
                PickUserForSetupActivity.z3((PickUserForSetupActivity) obj);
                return;
            default:
                final x0 x0Var = (x0) obj;
                int i13 = x0.f57761t;
                x0Var.getClass();
                h.l().a(new vh.a() { // from class: com.withings.wiscale2.heart.heartrate.v0
                    @Override // vh.a
                    public final void run() {
                        x0.t1(x0.this);
                    }
                }).p(x0Var);
                return;
        }
    }
}
