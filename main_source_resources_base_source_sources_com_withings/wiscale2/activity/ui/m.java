package com.withings.wiscale2.activity.ui;

import android.view.View;
import android.widget.RadioGroup;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.C1987R;
import java.util.Iterator;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: VasistasInfoOptionSheetFragment.kt */
/* loaded from: classes4.dex */
final class m extends w implements p<com.google.android.material.bottomsheet.l, View, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vasistas.Category f48643a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Vasistas.Category category) {
        super(2);
        this.f48643a = category;
    }

    @Override // ym0.p
    public final y invoke(com.google.android.material.bottomsheet.l lVar, View view) {
        Object obj;
        int i11;
        final com.google.android.material.bottomsheet.l dialog = lVar;
        View customView = view;
        u.j(dialog, "dialog");
        u.j(customView, "customView");
        RadioGroup radioGroup = (RadioGroup) customView.findViewById(C1987R.id.dialog_vasistas_info_type_container);
        VasistasCategoryId.f48535c.getClass();
        Iterator it = ((kotlin.collections.c) VasistasCategoryId.d()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((VasistasCategoryId) obj).b() == this.f48643a) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        VasistasCategoryId vasistasCategoryId = (VasistasCategoryId) obj;
        if (vasistasCategoryId != null) {
            i11 = vasistasCategoryId.f48538a;
        } else {
            i11 = C1987R.id.all_vasistas;
        }
        radioGroup.check(i11);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: ea0.v
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i12) {
                com.withings.wiscale2.activity.ui.l.a(com.google.android.material.bottomsheet.l.this, i12);
            }
        });
        return y.f85009a;
    }
}
