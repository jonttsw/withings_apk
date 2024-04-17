package com.withings.wiscale2.device.sct01.tutorial.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import ce0.a;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.tutorial.h;
import com.withings.wiscale2.spo2.m;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import wc0.b;
/* compiled from: Sct01TutorialNavigation.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/sct01/tutorial/ui/FinalTipsFragment;", "Lwc0/b;", "Lcom/withings/wiscale2/device/common/tutorial/h;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinalTipsFragment extends b<h> {
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        t1(a.a().f());
        int[] iArr = {C1987R.string.temperatureMeasurement_tutorial_finalTips_noSkinContact_message, C1987R.string._TM_SCT01_TUTO_POSN_TIPS_2_, C1987R.string.temperatureMeasurement_tutorial_finalTips_hairWarning_message};
        ArrayList arrayList = new ArrayList(3);
        int i11 = 0;
        int i12 = 0;
        while (i11 < 3) {
            int i13 = iArr[i11];
            LinearLayout extraContent = u1().f99591b;
            u.i(extraContent, "extraContent");
            LayoutInflater layoutInflater = getLayoutInflater();
            u.i(layoutInflater, "getLayoutInflater(...)");
            arrayList.add(m.e(extraContent, layoutInflater, i12, i13));
            i11++;
            i12++;
        }
        s1(arrayList);
    }
}
