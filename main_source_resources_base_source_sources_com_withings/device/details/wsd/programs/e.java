package com.withings.device.details.wsd.programs;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.withings.device.details.wsd.programs.WsdSetProgramActivity;
import com.withings.discourse.DiscourseActivity;
import kotlin.jvm.internal.u;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f37174a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f37175b;

    public /* synthetic */ e(AppCompatActivity appCompatActivity, int i11) {
        this.f37174a = i11;
        this.f37175b = appCompatActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i11 = this.f37174a;
        AppCompatActivity appCompatActivity = this.f37175b;
        switch (i11) {
            case 0:
                WsdSetProgramActivity this$0 = (WsdSetProgramActivity) appCompatActivity;
                WsdSetProgramActivity.a aVar = WsdSetProgramActivity.f37105h;
                u.j(this$0, "this$0");
                this$0.z3();
                return;
            default:
                DiscourseActivity this$02 = (DiscourseActivity) appCompatActivity;
                int i12 = DiscourseActivity.f37969c;
                u.j(this$02, "this$0");
                this$02.finish();
                return;
        }
    }
}
