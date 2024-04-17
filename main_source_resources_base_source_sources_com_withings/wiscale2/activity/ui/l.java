package com.withings.wiscale2.activity.ui;

import androidx.fragment.app.FragmentManager;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.C1987R;
import gi.j;
import java.util.Iterator;
import kotlin.jvm.internal.u;
/* compiled from: VasistasInfoOptionSheetFragment.kt */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static a f48642a;

    /* compiled from: VasistasInfoOptionSheetFragment.kt */
    /* loaded from: classes4.dex */
    public interface a {
        void l(int i11, Vasistas.Category category);
    }

    public static void a(com.google.android.material.bottomsheet.l dialog, int i11) {
        Vasistas.Category category;
        Object obj;
        int i12;
        u.j(dialog, "$dialog");
        a aVar = f48642a;
        if (aVar != null) {
            VasistasCategoryId.f48535c.getClass();
            Iterator it = ((kotlin.collections.c) VasistasCategoryId.d()).iterator();
            while (true) {
                category = null;
                if (it.hasNext()) {
                    obj = it.next();
                    i12 = ((VasistasCategoryId) obj).f48538a;
                    if (i12 == i11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            VasistasCategoryId vasistasCategoryId = (VasistasCategoryId) obj;
            if (vasistasCategoryId != null) {
                category = vasistasCategoryId.b();
            }
            aVar.l(i11, category);
        }
        dialog.dismiss();
    }

    public static final void b(VasistasInfoActivity activity, Vasistas.Category category, VasistasInfoActivity listener) {
        u.j(activity, "activity");
        u.j(listener, "listener");
        f48642a = listener;
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        j.a aVar = new j.a(supportFragmentManager);
        aVar.v(C1987R.layout.dialog_vasistas_info, new m(category));
        aVar.x();
    }
}
