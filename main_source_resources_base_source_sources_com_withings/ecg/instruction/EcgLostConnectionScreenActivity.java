package com.withings.ecg.instruction;

import android.os.Bundle;
import androidx.fragment.app.m0;
import com.withings.android.activity.WithingsActivity;
import com.withings.views.instruction.InstructionScreenData;
import com.withings.wiscale2.C1987R;
import g80.b;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: EcgLostConnectionScreenActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/ecg/instruction/EcgLostConnectionScreenActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EcgLostConnectionScreenActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f38583a = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.ecg_lost_connection_screen);
        String string = getString(C1987R.string.ecg_live_lostConnectionTitle);
        u.i(string, "getString(...)");
        String string2 = getString(C1987R.string.ecg_live_lostConnectionDescription);
        u.i(string2, "getString(...)");
        String string3 = getString(C1987R.string._DONE_);
        u.i(string3, "getString(...)");
        InstructionScreenData instructionScreenData = new InstructionScreenData(null, string, string2, 2131231312, string3, true);
        b.a aVar = b.f68527j;
        a aVar2 = new a(this);
        aVar.getClass();
        b a11 = b.a.a(instructionScreenData, aVar2);
        m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.content, a11, null);
        m11.e(null);
        m11.g();
    }
}
