package com.withings.wiscale2.device.sct01.tutorial.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ce0.a;
import com.withings.fever.core.model.FeverLevel;
import com.withings.fever.ui.r0;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.tutorial.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.j;
import wc0.b;
/* compiled from: Sct01TutorialNavigation.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/sct01/tutorial/ui/ResultsFragment;", "Lwc0/b;", "Lcom/withings/wiscale2/device/common/tutorial/h;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ResultsFragment extends b<h> {
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        t1(a.a().h());
        List<FeverLevel> W = x.W(FeverLevel.f39196a, FeverLevel.f39197b, FeverLevel.f39198c);
        int h11 = s0.h(x.y(W, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (FeverLevel feverLevel : W) {
            j jVar = new j(Integer.valueOf(r0.c(feverLevel)), Integer.valueOf(r0.d(feverLevel)));
            linkedHashMap.put(jVar.c(), jVar.d());
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            LinearLayout extraContent = u1().f99591b;
            u.i(extraContent, "extraContent");
            LayoutInflater layoutInflater = getLayoutInflater();
            u.i(layoutInflater, "getLayoutInflater(...)");
            int intValue = ((Number) entry.getKey()).intValue();
            int intValue2 = ((Number) entry.getValue()).intValue();
            View inflate = layoutInflater.inflate(C1987R.layout.item_status, (ViewGroup) extraContent, false);
            View findViewById = inflate.findViewById(C1987R.id.circle);
            Context context = inflate.getContext();
            u.i(context, "getContext(...)");
            findViewById.setBackground(y70.a.a(C1987R.drawable.circle_shape, context, intValue));
            ((TextView) inflate.findViewById(C1987R.id.status)).setText(intValue2);
            int dimensionPixelSize = inflate.getResources().getDimensionPixelSize(C1987R.dimen.keyline_0);
            inflate.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            arrayList.add(inflate);
        }
        s1(arrayList);
    }
}
