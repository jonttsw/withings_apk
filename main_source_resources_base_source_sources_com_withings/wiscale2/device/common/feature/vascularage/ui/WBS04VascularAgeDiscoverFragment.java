package com.withings.wiscale2.device.common.feature.vascularage.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.tutorial.h;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import tb0.w2;
import wc0.b;
import y70.a;
/* compiled from: WBS04VascularAgeTutorialNavigation.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/vascularage/ui/WBS04VascularAgeDiscoverFragment;", "Lwc0/b;", "Lcom/withings/wiscale2/device/common/tutorial/h;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WBS04VascularAgeDiscoverFragment extends b<h> {
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        kc0.b bVar = kc0.b.f75846a;
        t1(kc0.b.e());
        w2 u12 = u1();
        LinearLayout extraContent = u12.f99591b;
        u.i(extraContent, "extraContent");
        LayoutInflater layoutInflater = getLayoutInflater();
        u.i(layoutInflater, "getLayoutInflater(...)");
        View inflate = layoutInflater.inflate(C1987R.layout.item_icon_text, (ViewGroup) extraContent, false);
        TextView textView = (TextView) inflate.findViewById(C1987R.id.text);
        textView.setText(C1987R.string.vascular_age_tuto_01_disclaimer);
        textView.setTextAppearance(C1987R.style.detail1);
        Context context = inflate.getContext();
        u.i(context, "getContext(...)");
        int w11 = ah.u.w(C1987R.attr.colorOnBackground, context, -65281);
        Context context2 = inflate.getContext();
        u.i(context2, "getContext(...)");
        ((ImageView) inflate.findViewById(C1987R.id.icon)).setImageDrawable(a.c(C1987R.drawable.icon_medium_feature_info, context2, w11));
        inflate.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        inflate.setPadding(0, 0, 0, 0);
        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
        ConstraintLayout constraintLayout = u12.f99594e;
        bVar2.k(constraintLayout);
        LinearLayout linearLayout = u12.f99591b;
        bVar2.o(linearLayout.getId(), 4, 0, 4, 0);
        bVar2.P(linearLayout.getId());
        bVar2.e(constraintLayout);
        s1(x.V(inflate));
    }
}
