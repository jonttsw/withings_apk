package com.withings.learnmore.ui;

import android.support.v4.media.session.c;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.withings.common.compose.component.o;
import com.withings.learnmore.adapter.LearnMoreEntry;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1.d;
import k1.j1;
import k1.v0;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.y;
import yk.h;
import ym0.l;
import ym0.p;
/* compiled from: LearnMoreSimpleList.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "Lcom/withings/learnmore/adapter/LearnMoreEntryTranslations;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Lkotlin/Function1;", "Lcom/withings/learnmore/adapter/LearnMoreEntry;", "Lnm0/y;", "onItemClicked", "LearnMoreSimpleList", "(Ljava/util/List;Lym0/l;Landroidx/compose/runtime/a;I)V", "learnmore_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LearnMoreSimpleListKt {
    public static final void LearnMoreSimpleList(List<LearnMoreEntryTranslations> entries, l<? super LearnMoreEntry, y> onItemClicked, a aVar, int i11) {
        boolean z5;
        boolean z11;
        u.j(entries, "entries");
        u.j(onItemClicked, "onItemClicked");
        b g11 = aVar.g(-2076076344);
        List<LearnMoreEntryTranslations> list = entries;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        for (LearnMoreEntryTranslations learnMoreEntryTranslations : list) {
            arrayList.add(learnMoreEntryTranslations.languageOrDefault());
        }
        e e11 = e1.e(e.f8927a, 1.0f);
        g11.s(-483455358);
        l0 b10 = c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
        if (g11.i() instanceof d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            boolean z12 = false;
            dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
            g11.s(-813044969);
            Iterator it = arrayList.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i13 = i12 + 1;
                if (i12 >= 0) {
                    LearnMoreEntry learnMoreEntry = (LearnMoreEntry) next;
                    e h11 = x0.h(e.f8927a, h.o(), 0.0f, 2);
                    String label = learnMoreEntry.getLabel();
                    g11.s(202150084);
                    if ((((i11 & 112) ^ 48) > 32 && g11.K(onItemClicked)) || (i11 & 48) == 32) {
                        z5 = true;
                    } else {
                        z5 = z12;
                    }
                    boolean K = z5 | g11.K(learnMoreEntry);
                    Object t11 = g11.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new LearnMoreSimpleListKt$LearnMoreSimpleList$1$1$1$1(onItemClicked, learnMoreEntry);
                        g11.n(t11);
                    }
                    g11.J();
                    int i14 = i12;
                    ArrayList arrayList2 = arrayList;
                    o.g(h11, null, null, label, null, false, false, true, null, null, (ym0.a) t11, g11, 12582912, 0, 886);
                    g11.s(901419868);
                    if (i14 < x.M(arrayList2)) {
                        z11 = false;
                        com.withings.common.compose.component.v0.b(h.o(), g11, 0, 0);
                    } else {
                        z11 = false;
                    }
                    g11.J();
                    z12 = z11;
                    i12 = i13;
                    arrayList = arrayList2;
                } else {
                    x.K0();
                    throw null;
                }
            }
            v a12 = com.withings.authentication.mfa.resolve.components.h.a(g11);
            if (a12 != null) {
                a12.G(new LearnMoreSimpleListKt$LearnMoreSimpleList$2(entries, onItemClicked, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }
}
