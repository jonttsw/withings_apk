package com.withings.wiscale2.measure.list;

import android.content.Context;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.wiscale2.heart.HeartDetailActivity;
/* compiled from: MeasureDisplayer.kt */
/* loaded from: classes5.dex */
public final class b extends i {

    /* renamed from: c  reason: collision with root package name */
    private final ym0.q<k, User, MeasuresGroup, nm0.y> f58523c = a.f58525a;

    /* renamed from: d  reason: collision with root package name */
    private final ym0.q<Context, User, MeasuresGroup, nm0.y> f58524d = C0756b.f58526a;

    /* compiled from: MeasureDisplayer.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.q<k, User, MeasuresGroup, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f58525a = new kotlin.jvm.internal.w(3);

        /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
        @Override // ym0.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final nm0.y invoke(com.withings.wiscale2.measure.list.k r7, com.withings.user.User r8, com.withings.library.measure.MeasuresGroup r9) {
            /*
                r6 = this;
                com.withings.wiscale2.measure.list.k r7 = (com.withings.wiscale2.measure.list.k) r7
                com.withings.user.User r8 = (com.withings.user.User) r8
                com.withings.library.measure.MeasuresGroup r9 = (com.withings.library.measure.MeasuresGroup) r9
                java.lang.String r0 = "measureItemViewHolder"
                kotlin.jvm.internal.u.j(r7, r0)
                java.lang.String r0 = "<anonymous parameter 1>"
                kotlin.jvm.internal.u.j(r8, r0)
                java.lang.String r8 = "measuresGroup"
                kotlin.jvm.internal.u.j(r9, r8)
                r8 = 11
                com.withings.library.measure.Measure r8 = r9.getMeasureForType(r8)
                r9 = 0
                if (r8 == 0) goto L58
                android.view.View r0 = r7.itemView
                android.content.Context r0 = r0.getContext()
                kotlin.jvm.internal.u.g(r0)
                jm.a r0 = jm.a.d.a(r0)
                double r1 = r8.f95794y
                int r1 = (int) r1
                com.withings.heartrate.core.HeartRateDiagnostic r1 = ah.g.l(r1)
                android.widget.TextView r2 = r7.a()
                if (r1 == 0) goto L43
                int r3 = r8.getType()
                double r4 = r8.f95794y
                java.lang.String r0 = r0.f(r4, r3)
                goto L45
            L43:
                java.lang.String r0 = "--"
            L45:
                r2.setText(r0)
                if (r1 == 0) goto L58
                int r0 = ah.l.m(r1)
                android.widget.TextView r7 = r7.b()
                r7.setText(r0)
                nm0.y r7 = nm0.y.f85009a
                goto L59
            L58:
                r7 = r9
            L59:
                if (r7 != 0) goto L5e
                com.withings.util.log.Fail.h(r8, r9)
            L5e:
                nm0.y r7 = nm0.y.f85009a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.measure.list.b.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: MeasureDisplayer.kt */
    /* renamed from: com.withings.wiscale2.measure.list.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0756b extends kotlin.jvm.internal.w implements ym0.q<Context, User, MeasuresGroup, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0756b f58526a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(Context context, User user, MeasuresGroup measuresGroup) {
            Context context2 = context;
            User user2 = user;
            MeasuresGroup measuresGroup2 = measuresGroup;
            kotlin.jvm.internal.u.j(context2, "context");
            kotlin.jvm.internal.u.j(user2, "user");
            kotlin.jvm.internal.u.j(measuresGroup2, "measuresGroup");
            context2.startActivity(HeartDetailActivity.D3(context2, measuresGroup2, 1, user2.q()));
            return nm0.y.f85009a;
        }
    }

    @Override // com.withings.wiscale2.measure.list.i
    public final ym0.q<k, User, MeasuresGroup, nm0.y> d() {
        return this.f58523c;
    }

    @Override // com.withings.wiscale2.measure.list.i
    public final ym0.q<Context, User, MeasuresGroup, nm0.y> e() {
        return this.f58524d;
    }
}
