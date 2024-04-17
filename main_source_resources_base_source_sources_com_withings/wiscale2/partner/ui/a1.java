package com.withings.wiscale2.partner.ui;

import android.content.Context;
import com.withings.partner.model.Partner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import y10.a;
/* compiled from: PartnerExchangesFragment.kt */
/* loaded from: classes5.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<u10.u> f58891a = kotlin.collections.x.V(a.d.f108300d);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerExchangesFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerExchangesFragmentKt", f = "PartnerExchangesFragment.kt", l = {495}, m = "mapToState")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Context f58892a;

        /* renamed from: b  reason: collision with root package name */
        Partner f58893b;

        /* renamed from: c  reason: collision with root package name */
        Collection f58894c;

        /* renamed from: d  reason: collision with root package name */
        Iterator f58895d;

        /* renamed from: e  reason: collision with root package name */
        u10.u f58896e;

        /* renamed from: f  reason: collision with root package name */
        Collection f58897f;

        /* renamed from: g  reason: collision with root package name */
        boolean f58898g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f58899h;

        /* renamed from: i  reason: collision with root package name */
        int f58900i;

        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58899h = obj;
            this.f58900i |= Integer.MIN_VALUE;
            return a1.c(null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    public static final Object a(Context context, Partner partner, qm0.d<? super List<d0>> dVar) {
        List b10;
        int ordinal = partner.ordinal();
        if (ordinal != 2) {
            if (ordinal != 7) {
                sf0.y e11 = a70.a.e(partner);
                if (e11 != null) {
                    ArrayList f11 = a70.a.f(e11);
                    b10 = new ArrayList(kotlin.collections.x.y(f11, 10));
                    Iterator it = f11.iterator();
                    while (it.hasNext()) {
                        b10.add(((sf0.e) it.next()).c());
                    }
                } else {
                    b10 = 0;
                }
                if (b10 == 0) {
                    b10 = kotlin.collections.i0.f76187a;
                }
            } else {
                b10 = y10.b.b();
            }
        } else {
            b10 = v10.d.b();
        }
        return c(b10, context, partner, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<u10.u>] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.collections.i0] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    public static final Object b(Context context, Partner partner, qm0.d<? super List<d0>> dVar) {
        ?? c11;
        int ordinal = partner.ordinal();
        if (ordinal != 2) {
            if (ordinal != 7) {
                sf0.y e11 = a70.a.e(partner);
                if (e11 != null) {
                    ArrayList g11 = a70.a.g(e11);
                    c11 = new ArrayList(kotlin.collections.x.y(g11, 10));
                    Iterator it = g11.iterator();
                    while (it.hasNext()) {
                        c11.add(((sf0.g) it.next()).f());
                    }
                } else {
                    c11 = 0;
                }
                if (c11 == 0) {
                    c11 = kotlin.collections.i0.f76187a;
                }
            } else {
                c11 = f58891a;
            }
        } else {
            c11 = v10.d.c();
        }
        return c(c11, context, partner, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.withings.wiscale2.partner.ui.a1$a] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0093 -> B:23:0x009a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a9 -> B:25:0x00b4). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(java.util.List<? extends u10.u> r11, android.content.Context r12, com.withings.partner.model.Partner r13, qm0.d<? super java.util.List<com.withings.wiscale2.partner.ui.d0>> r14) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.partner.ui.a1.c(java.util.List, android.content.Context, com.withings.partner.model.Partner, qm0.d):java.lang.Object");
    }
}
