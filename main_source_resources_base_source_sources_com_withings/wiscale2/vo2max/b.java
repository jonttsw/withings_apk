package com.withings.wiscale2.vo2max;

import android.content.Context;
import c10.c;
import c10.d;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.Track;
import javax.inject.Inject;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import nm0.y;
import org.joda.time.Instant;
/* compiled from: Vo2MaxGenerator.kt */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f62622a;

    /* renamed from: b  reason: collision with root package name */
    private final a10.a f62623b;

    /* renamed from: c  reason: collision with root package name */
    private final d10.a f62624c;

    /* compiled from: Vo2MaxGenerator.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static c a(Track track, Context context) {
            u.j(context, "context");
            u.j(track, "track");
            String str = "VO2MAX-track:" + track.getId();
            Instant instant = track.getStartDate().toInstant();
            String string = context.getString(C1987R.string.vo2maxInfoItem_title);
            String string2 = context.getString(C1987R.string.vo2maxInfoItem_message);
            int deviceModel = track.getDeviceModel();
            int i11 = C1987R.string.hwa09_workoutDetail_notificationUrl_vo2MaxHowToGet;
            if (deviceModel != 93 && deviceModel != 95) {
                i11 = C1987R.string.vo2maxInfoItem_url;
            }
            d.h hVar = new d.h(string, string2, null, "statusInfo", "help", new c10.a("url", context.getString(i11)), null, null, null, 8008);
            u.g(instant);
            return new c("webservice", str, false, hVar, instant, null, 1760);
        }
    }

    @Inject
    public b(Context context, x00.b bVar, d10.a aVar) {
        this.f62622a = context;
        this.f62623b = bVar;
        this.f62624c = aVar;
    }

    public final Object a(Track track, kotlin.coroutines.jvm.internal.c cVar) {
        Object a11 = this.f62624c.a(track.getUserId(), a.a(track, this.f62622a), cVar);
        if (a11 == CoroutineSingletons.f76214a) {
            return a11;
        }
        return y.f85009a;
    }

    public final Object b(Track track, qm0.d<? super y> dVar) {
        long userId = track.getUserId();
        Long id2 = track.getId();
        Object b10 = this.f62623b.b(userId, "webservice", "VO2MAX-track:" + id2, dVar);
        if (b10 == CoroutineSingletons.f76214a) {
            return b10;
        }
        return y.f85009a;
    }
}
