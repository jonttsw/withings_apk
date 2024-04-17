package com.withings.wiscale2.device.wpm.wpm06.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import hf0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import xw.d;
/* compiled from: Wpm06PostInstallActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm06/ui/Wpm06PostInstallActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm06PostInstallActivity extends WithingsActivity {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f55960b = 0;

    /* renamed from: a  reason: collision with root package name */
    private c f55961a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        c cVar = this.f55961a;
        if (cVar != null) {
            cVar.i0(i11);
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.k1$b, java.lang.Object] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c cVar = (c) new k1(this, (k1.b) new Object()).a(c.class);
        d.d(this, cVar.g0(), new a(this));
        d.d(this, cVar.f0(), new b(this));
        this.f55961a = cVar;
    }
}
