package com.withings.learnmore.ui;

import android.support.v4.media.session.c;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.g9;
import androidx.compose.material3.i1;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.q3;
import com.withings.learnmore.adapter.LearnMoreEntry;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import java.util.List;
import k1.d;
import k1.j1;
import k1.v0;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import n0.y0;
import n0.z0;
import nk.a0;
import yk.h;
import yk.o;
import ym0.p;
/* compiled from: LearnMoreScreens.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"", "title", "", "Lcom/withings/learnmore/adapter/LearnMoreEntryTranslations;", "learnMoreEntryTranslations", "Lnm0/y;", "SectionLearnMore", "(Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/a;I)V", "ArticleCardPreview", "(Landroidx/compose/runtime/a;I)V", "SectionLearnMorePreview", "learnmore_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LearnMoreScreensKt {
    public static final void ArticleCardPreview(a aVar, int i11) {
        b g11 = aVar.g(-1887002129);
        if (i11 == 0 && g11.h()) {
            g11.C();
        } else {
            o.b(false, ComposableSingletons$LearnMoreScreensKt.INSTANCE.m28getLambda1$learnmore_release(), g11, 48, 1);
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new LearnMoreScreensKt$ArticleCardPreview$1(i11));
        }
    }

    public static final void SectionLearnMore(String title, List<LearnMoreEntryTranslations> learnMoreEntryTranslations, a aVar, int i11) {
        List<LearnMoreEntryTranslations> list;
        b bVar;
        u.j(title, "title");
        u.j(learnMoreEntryTranslations, "learnMoreEntryTranslations");
        b g11 = aVar.g(1397654122);
        if (!learnMoreEntryTranslations.isEmpty()) {
            list = learnMoreEntryTranslations;
        } else {
            list = null;
        }
        if (list == null) {
            bVar = g11;
        } else {
            z0 b10 = y0.b(g11);
            e.a aVar2 = e.f8927a;
            e h11 = x0.h(aVar2, 0.0f, h.y(), 1);
            g11.s(-483455358);
            l0 b11 = c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = y.c(h11);
            if (g11.i() instanceof d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                p b12 = com.withings.authentication.e.b(g11, b11, g11, l5);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b12);
                }
                a0.f(0, (i11 << 3) & 112, 28, 0L, g11, x0.j(x0.h(aVar2, og.y.a(0, c11, j1.a(g11), g11, 2058660585), 0.0f, 2), 0.0f, 0.0f, 0.0f, h.h(), 7), null, title);
                bVar = g11;
                q3.a(0, null, ((i1) g11.D(androidx.compose.material3.j1.e())).a(), 0L, h.e(), null, null, 0.0f, null, b10, s1.b.b(g11, 1481940193, new LearnMoreScreensKt$SectionLearnMore$2$1$1(list)), bVar, 6, 6, 490);
                g9.a(bVar);
            } else {
                a3.g.s();
                throw null;
            }
        }
        v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new LearnMoreScreensKt$SectionLearnMore$3(title, learnMoreEntryTranslations, i11));
        }
    }

    public static final void SectionLearnMorePreview(a aVar, int i11) {
        b g11 = aVar.g(-1691835335);
        if (i11 == 0 && g11.h()) {
            g11.C();
        } else {
            o.b(false, s1.b.b(g11, -683009709, new LearnMoreScreensKt$SectionLearnMorePreview$1(x.W(new LearnMoreEntryTranslations(null, new LearnMoreEntry("noUrl", "Here is one title !", null, 4, null), null, null, null, null, null, null, null, null, null, 2045, null), new LearnMoreEntryTranslations(null, new LearnMoreEntry("noUrl", "Here is another title !", null, 4, null), null, null, null, null, null, null, null, null, null, 2045, null), new LearnMoreEntryTranslations(null, new LearnMoreEntry("noUrl", "Wow you're lucky ! A third title !", null, 4, null), null, null, null, null, null, null, null, null, null, 2045, null)))), g11, 48, 1);
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new LearnMoreScreensKt$SectionLearnMorePreview$2(i11));
        }
    }
}
