package com.withings.wiscale2.heart.heartrate.events;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.camera.core.v;
import androidx.constraintlayout.widget.Group;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.data.LocalTargetRepository;
import com.withings.target.data.TargetRepository;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.heart.heartrate.BaseHeartRateScoreActivity;
import fn0.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import lj0.h0;
import m70.i;
import ng0.f;
import ng0.j;
import nm0.h;
import org.joda.time.DateTime;
import tb0.f1;
/* compiled from: HeartRateEventsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/heart/heartrate/events/HeartRateEventsActivity;", "Lcom/withings/wiscale2/heart/heartrate/BaseHeartRateScoreActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HeartRateEventsActivity extends BaseHeartRateScoreActivity {

    /* renamed from: f  reason: collision with root package name */
    private f1 f57626f;

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f57622k = {v.c(HeartRateEventsActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), v.c(HeartRateEventsActivity.class, FirebaseAnalytics.Param.LEVEL, "getLevel()I", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final a f57621j = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final c f57623c = new c(this);

    /* renamed from: d  reason: collision with root package name */
    private final d f57624d = new d(this);

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f57625e = h.b(new e());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f57627g = h.b(new f());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f57628h = h.b(b.f57630a);

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f57629i = h.b(new g());

    /* compiled from: HeartRateEventsActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, User user, DateTime dateTime, ng0.f fVar) {
            u.j(user, "user");
            Intent putExtra = new Intent(context, HeartRateEventsActivity.class).putExtra("EXTRA_HR_EVENTS_LEVEL", fVar.b()).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("date", dateTime);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: HeartRateEventsActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<ng0.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f57630a = new w(0);

        @Override // ym0.a
        public final ng0.e invoke() {
            return new ng0.e();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57631a = h.b(new com.withings.wiscale2.heart.heartrate.events.c(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57632b;

        public c(Activity activity) {
            this.f57632b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f57631a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57633a = h.b(new com.withings.wiscale2.heart.heartrate.events.d(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57634b;

        public d(Activity activity) {
            this.f57634b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f57633a.getValue();
        }
    }

    /* compiled from: HeartRateEventsActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements ym0.a<DateTime> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final DateTime invoke() {
            return ((DateTime) b0.H(HeartRateEventsActivity.this, "date")).withTimeAtStartOfDay();
        }
    }

    /* compiled from: HeartRateEventsActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements ym0.a<ng0.f> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final ng0.f invoke() {
            if (HeartRateEventsActivity.D3(HeartRateEventsActivity.this) == 1) {
                return f.b.f84180e;
            }
            return f.a.f84179e;
        }
    }

    /* compiled from: HeartRateEventsActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends w implements ym0.a<ng0.g> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final ng0.g invoke() {
            HeartRateEventsActivity heartRateEventsActivity = HeartRateEventsActivity.this;
            Application application = heartRateEventsActivity.getApplication();
            u.i(application, "getApplication(...)");
            DateTime E3 = HeartRateEventsActivity.E3(heartRateEventsActivity);
            u.i(E3, "access$getStartOfDay(...)");
            ng0.f I3 = heartRateEventsActivity.I3();
            mg0.c cVar = mg0.c.f82024g;
            if (cVar != null) {
                User G3 = HeartRateEventsActivity.G3(heartRateEventsActivity);
                i b10 = i.b();
                u.i(b10, "get(...)");
                TargetRepository targetRepository = LocalTargetRepository.Companion.get();
                kn.e c11 = kn.e.c();
                u.i(c11, "get(...)");
                h0 e11 = h0.e();
                u.i(e11, "get(...)");
                return new ng0.g(application, E3, I3, cVar, G3, b10, targetRepository, c11, e11);
            }
            u.s("instance");
            throw null;
        }
    }

    public static final void C3(HeartRateEventsActivity heartRateEventsActivity, List list) {
        int i11;
        f1 f1Var = heartRateEventsActivity.f57626f;
        if (f1Var != null) {
            Group hrEventsListGroup = f1Var.f99056a;
            u.i(hrEventsListGroup, "hrEventsListGroup");
            if (!list.isEmpty()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            hrEventsListGroup.setVisibility(i11);
            f1 f1Var2 = heartRateEventsActivity.f57626f;
            if (f1Var2 != null) {
                nm0.g gVar = heartRateEventsActivity.f57628h;
                f1Var2.f99057b.setAdapter((ng0.e) gVar.getValue());
                ((ng0.e) gVar.getValue()).submitList(list);
                return;
            }
            u.s("binding");
            throw null;
        }
        u.s("binding");
        throw null;
    }

    public static final int D3(HeartRateEventsActivity heartRateEventsActivity) {
        return ((Number) heartRateEventsActivity.f57624d.getValue(heartRateEventsActivity, f57622k[1])).intValue();
    }

    public static final DateTime E3(HeartRateEventsActivity heartRateEventsActivity) {
        return (DateTime) heartRateEventsActivity.f57625e.getValue();
    }

    public static final User G3(HeartRateEventsActivity heartRateEventsActivity) {
        return (User) heartRateEventsActivity.f57623c.getValue(heartRateEventsActivity, f57622k[0]);
    }

    public static final void H3(HeartRateEventsActivity heartRateEventsActivity, int i11, j jVar) {
        int i12;
        int i13;
        String string = heartRateEventsActivity.getString(heartRateEventsActivity.I3().d());
        u.i(string, "getString(...)");
        heartRateEventsActivity.I3().getClass();
        heartRateEventsActivity.B3(string, wq.a.b(heartRateEventsActivity, C1987R.plurals.events_plural, i11, Integer.valueOf(i11)));
        heartRateEventsActivity.I3().getClass();
        if (i11 == 0) {
            i12 = C1987R.drawable.ic_check_white;
        } else {
            i12 = C1987R.drawable.icon_medium_status_moderate;
        }
        heartRateEventsActivity.I3().getClass();
        if (i11 == 0) {
            i13 = C1987R.color.statusGood;
        } else {
            i13 = C1987R.color.statusModerate;
        }
        heartRateEventsActivity.A3(i12, i13);
        f1 f1Var = heartRateEventsActivity.f57626f;
        if (f1Var != null) {
            f1Var.f99058c.setText(heartRateEventsActivity.I3().a(i11, heartRateEventsActivity, jVar.a()));
            return;
        }
        u.s("binding");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ng0.f I3() {
        return (ng0.f) this.f57627g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.wiscale2.heart.heartrate.BaseHeartRateScoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f57626f = f1.a(getLayoutInflater(), z3().f99569d);
        nm0.g gVar = this.f57629i;
        ((ng0.g) gVar.getValue()).f0().observe(this, new com.withings.wiscale2.heart.heartrate.events.e(new com.withings.wiscale2.heart.heartrate.events.a(this)));
        ((ng0.g) gVar.getValue()).g0().observe(this, new com.withings.wiscale2.heart.heartrate.events.e(new com.withings.wiscale2.heart.heartrate.events.b(this)));
    }
}
