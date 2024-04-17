package com.withings.wiscale2.measure.list;

import android.content.Context;
import com.withings.fever.ui.r0;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.measure.detail.ui.screen.MeasureDetailActivity;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.util.log.Fail;
import com.withings.wiscale2.bodytemperature.data.BodyTemperatureMeasureDetailScreen;
import jm.a;
import org.joda.time.DateTime;
/* compiled from: MeasureDisplayer.kt */
/* loaded from: classes5.dex */
public final class a extends i {

    /* renamed from: c  reason: collision with root package name */
    private final ym0.q<k, User, MeasuresGroup, nm0.y> f58513c = C0755a.f58515a;

    /* renamed from: d  reason: collision with root package name */
    private final ym0.q<Context, User, MeasuresGroup, nm0.y> f58514d = b.f58516a;

    /* compiled from: MeasureDisplayer.kt */
    /* renamed from: com.withings.wiscale2.measure.list.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0755a extends kotlin.jvm.internal.w implements ym0.q<k, User, MeasuresGroup, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0755a f58515a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(k kVar, User user, MeasuresGroup measuresGroup) {
            nm0.y yVar;
            k measureItemViewHolder = kVar;
            User user2 = user;
            MeasuresGroup measuresGroup2 = measuresGroup;
            kotlin.jvm.internal.u.j(measureItemViewHolder, "measureItemViewHolder");
            kotlin.jvm.internal.u.j(user2, "user");
            kotlin.jvm.internal.u.j(measuresGroup2, "measuresGroup");
            Measure measureForType = measuresGroup2.getMeasureForType(71);
            if (measureForType != null) {
                Context context = measureItemViewHolder.itemView.getContext();
                kotlin.jvm.internal.u.g(context);
                jm.a a11 = a.d.a(context);
                long time = measuresGroup2.getDate().getTime();
                measureItemViewHolder.a().setText(a11.f(measureForType.f95794y, measureForType.getType()));
                new yr.a();
                DateTime f11 = user2.f();
                kotlin.jvm.internal.u.i(f11, "getBirthDate(...)");
                measureItemViewHolder.b().setText(context.getString(r0.d(yr.a.a(f11, new DateTime(time)).b(measureForType.f95794y))));
                yVar = nm0.y.f85009a;
            } else {
                yVar = null;
            }
            if (yVar == null) {
                Fail.h(measureForType, null);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: MeasureDisplayer.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.q<Context, User, MeasuresGroup, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f58516a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(Context context, User user, MeasuresGroup measuresGroup) {
            Context context2 = context;
            User user2 = user;
            MeasuresGroup measuresGroup2 = measuresGroup;
            kotlin.jvm.internal.u.j(context2, "context");
            kotlin.jvm.internal.u.j(user2, "user");
            kotlin.jvm.internal.u.j(measuresGroup2, "measuresGroup");
            MeasureDetailActivity.a aVar = MeasureDetailActivity.f41733o;
            long q11 = user2.q();
            BodyTemperatureMeasureDetailScreen bodyTemperatureMeasureDetailScreen = new BodyTemperatureMeasureDetailScreen(user2);
            Period.a aVar2 = Period.f43718c;
            long id2 = measuresGroup2.getId();
            aVar.getClass();
            context2.startActivity(MeasureDetailActivity.a.a(context2, q11, bodyTemperatureMeasureDetailScreen, id2));
            return nm0.y.f85009a;
        }
    }

    @Override // com.withings.wiscale2.measure.list.i
    public final ym0.q<k, User, MeasuresGroup, nm0.y> d() {
        return this.f58513c;
    }

    @Override // com.withings.wiscale2.measure.list.i
    public final ym0.q<Context, User, MeasuresGroup, nm0.y> e() {
        return this.f58514d;
    }
}
