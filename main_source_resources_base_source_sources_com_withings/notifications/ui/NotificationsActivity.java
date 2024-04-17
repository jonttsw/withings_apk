package com.withings.notifications.ui;

import android.app.Activity;
import android.os.Bundle;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: NotificationsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/notifications/ui/NotificationsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NotificationsActivity extends Hilt_NotificationsActivity {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public w00.a f42841e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public ch.d f42842f;

    /* renamed from: g  reason: collision with root package name */
    private final c f42843g = new c(this);

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f42840i = {androidx.camera.core.v.c(NotificationsActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final a f42839h = new Object();

    /* compiled from: NotificationsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: NotificationsActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -795271766, new x(NotificationsActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f42845a = nm0.h.b(new y(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f42846b;

        public c(Activity activity) {
            this.f42846b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f42845a.getValue();
        }
    }

    public static final long z3(NotificationsActivity notificationsActivity) {
        return ((Number) notificationsActivity.f42843g.getValue(notificationsActivity, f42840i[0])).longValue();
    }

    @Override // com.withings.notifications.ui.Hilt_NotificationsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, 632238736, new b()));
    }
}
