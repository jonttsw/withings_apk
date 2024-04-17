package com.withings.wiscale2.activity.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c1;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.b2;
import androidx.compose.material.h6;
import androidx.compose.material3.g9;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.u0;
import androidx.core.view.l1;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.withings.android.activity.WithingsActivity;
import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.activity.ui.l;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import d2.h0;
import dq.x;
import java.util.List;
import jm.a;
import k1.j1;
import k1.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import org.joda.time.DateTime;
import pm.e;
import r0.a0;
import r0.b0;
import x1.b;
import x1.d;
/* compiled from: VasistasInfoActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/activity/ui/VasistasInfoActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/activity/ui/l$a;", "<init>", "()V", com.huawei.hms.feature.dynamic.e.e.f28630a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class VasistasInfoActivity extends WithingsActivity implements l.a {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f48542a = nm0.h.b(new v());

    /* renamed from: b  reason: collision with root package name */
    private Vasistas.Category f48543b = Vasistas.Category.MOTION;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f48544c = nm0.h.b(p.f48605a);

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f48545d = nm0.h.b(new r());

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f48546e = nm0.h.b(new q());

    /* renamed from: f  reason: collision with root package name */
    private final t f48547f = new t(this);

    /* renamed from: g  reason: collision with root package name */
    private final u f48548g = new u(this);

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f48541i = {androidx.camera.core.v.c(VasistasInfoActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(VasistasInfoActivity.class, FoodDayFragment.ARG_DAY, "getDay()Lorg/joda/time/DateTime;", 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final e f48540h = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f48550b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Vasistas f48551c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f48552d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, Vasistas vasistas, int i11) {
            super(2);
            this.f48550b = eVar;
            this.f48551c = vasistas;
            this.f48552d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48552d | 1);
            androidx.compose.ui.e eVar = this.f48550b;
            Vasistas vasistas = this.f48551c;
            VasistasInfoActivity.this.z3(eVar, vasistas, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ActivityAggregate f48554b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f48555c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ActivityAggregate activityAggregate, int i11) {
            super(2);
            this.f48554b = activityAggregate;
            this.f48555c = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48555c | 1);
            VasistasInfoActivity.this.A3(this.f48554b, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f48557b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Vasistas f48558c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f48559d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.e eVar, Vasistas vasistas, int i11) {
            super(2);
            this.f48557b = eVar;
            this.f48558c = vasistas;
            this.f48559d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48559d | 1);
            androidx.compose.ui.e eVar = this.f48557b;
            Vasistas vasistas = this.f48558c;
            VasistasInfoActivity.this.B3(eVar, vasistas, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f48561b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Vasistas f48562c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f48563d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.e eVar, Vasistas vasistas, int i11) {
            super(2);
            this.f48561b = eVar;
            this.f48562c = vasistas;
            this.f48563d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48563d | 1);
            androidx.compose.ui.e eVar = this.f48561b;
            Vasistas vasistas = this.f48562c;
            VasistasInfoActivity.this.C3(eVar, vasistas, aVar, g11);
            return y.f85009a;
        }
    }

    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public static final class e {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public static final class f extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f48565b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Vasistas f48566c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f48567d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.ui.e eVar, Vasistas vasistas, int i11) {
            super(2);
            this.f48565b = eVar;
            this.f48566c = vasistas;
            this.f48567d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48567d | 1);
            androidx.compose.ui.e eVar = this.f48565b;
            Vasistas vasistas = this.f48566c;
            VasistasInfoActivity.this.D3(eVar, vasistas, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public static final class g extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Vasistas f48569b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f48570c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f48571d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Vasistas vasistas, String str, int i11) {
            super(2);
            this.f48569b = vasistas;
            this.f48570c = str;
            this.f48571d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48571d | 1);
            Vasistas vasistas = this.f48569b;
            String str = this.f48570c;
            VasistasInfoActivity.this.E3(vasistas, str, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public static final class h extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f48573b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f48574c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f48575d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f48576e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.ui.e eVar, String str, String str2, int i11) {
            super(2);
            this.f48573b = eVar;
            this.f48574c = str;
            this.f48575d = str2;
            this.f48576e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48576e | 1);
            String str = this.f48574c;
            String str2 = this.f48575d;
            VasistasInfoActivity.this.F3(this.f48573b, str, str2, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public static final class i extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f48578b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Vasistas f48579c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f48580d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.ui.e eVar, Vasistas vasistas, int i11) {
            super(2);
            this.f48578b = eVar;
            this.f48579c = vasistas;
            this.f48580d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48580d | 1);
            androidx.compose.ui.e eVar = this.f48578b;
            Vasistas vasistas = this.f48579c;
            VasistasInfoActivity.this.G3(eVar, vasistas, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public static final class j extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f48582b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Vasistas f48583c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f48584d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.ui.e eVar, Vasistas vasistas, int i11) {
            super(2);
            this.f48582b = eVar;
            this.f48583c = vasistas;
            this.f48584d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48584d | 1);
            androidx.compose.ui.e eVar = this.f48582b;
            Vasistas vasistas = this.f48583c;
            VasistasInfoActivity.this.H3(eVar, vasistas, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public static final class k extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f48586b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Vasistas f48587c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f48588d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(androidx.compose.ui.e eVar, Vasistas vasistas, int i11) {
            super(2);
            this.f48586b = eVar;
            this.f48587c = vasistas;
            this.f48588d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48588d | 1);
            androidx.compose.ui.e eVar = this.f48586b;
            Vasistas vasistas = this.f48587c;
            VasistasInfoActivity.this.I3(eVar, vasistas, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public static final class l extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f48590b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Vasistas f48591c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f48592d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(androidx.compose.ui.e eVar, Vasistas vasistas, int i11) {
            super(2);
            this.f48590b = eVar;
            this.f48591c = vasistas;
            this.f48592d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48592d | 1);
            androidx.compose.ui.e eVar = this.f48590b;
            Vasistas vasistas = this.f48591c;
            VasistasInfoActivity.this.J3(eVar, vasistas, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public static final class m extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a0 f48594b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f48595c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Boolean f48596d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f48597e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f48598f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(a0 a0Var, boolean z5, Boolean bool, int i11, int i12) {
            super(2);
            this.f48594b = a0Var;
            this.f48595c = z5;
            this.f48596d = bool;
            this.f48597e = i11;
            this.f48598f = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48597e | 1);
            boolean z5 = this.f48595c;
            Boolean bool = this.f48596d;
            VasistasInfoActivity.this.K3(this.f48594b, z5, bool, aVar, g11, this.f48598f);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public static final class n extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f48600b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Vasistas f48601c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f48602d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f48603e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(androidx.compose.ui.e eVar, Vasistas vasistas, long j5, int i11) {
            super(2);
            this.f48600b = eVar;
            this.f48601c = vasistas;
            this.f48602d = j5;
            this.f48603e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f48603e | 1);
            Vasistas vasistas = this.f48601c;
            long j5 = this.f48602d;
            VasistasInfoActivity.this.L3(this.f48600b, vasistas, j5, aVar, g11);
            return y.f85009a;
        }
    }

    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class o {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f48604a;

        static {
            int[] iArr = new int[Vasistas.Category.values().length];
            try {
                iArr[Vasistas.Category.MOTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Vasistas.Category.BED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Vasistas.Category.BODY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Vasistas.Category.PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Vasistas.Category.SPO2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Vasistas.Category.AHI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Vasistas.Category.SWIM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Vasistas.Category.CORE_TEMPERATURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f48604a = iArr;
        }
    }

    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    static final class p extends w implements ym0.a<fl.p> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f48605a = new w(0);

        @Override // ym0.a
        public final fl.p invoke() {
            return fl.p.f67672b.a();
        }
    }

    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    static final class q extends w implements ym0.a<pm.e> {
        q() {
            super(0);
        }

        @Override // ym0.a
        public final pm.e invoke() {
            e.a aVar = new e.a(VasistasInfoActivity.this, 0);
            aVar.u(true);
            return new pm.e(aVar);
        }
    }

    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    static final class r extends w implements ym0.a<jm.a> {
        r() {
            super(0);
        }

        @Override // ym0.a
        public final jm.a invoke() {
            return a.d.a(VasistasInfoActivity.this);
        }
    }

    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    static final class s extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {
        s() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 1423799703, new com.withings.wiscale2.activity.ui.i(VasistasInfoActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class t implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f48609a = nm0.h.b(new com.withings.wiscale2.activity.ui.j(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f48610b;

        public t(Activity activity) {
            this.f48610b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f48609a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class u implements bn0.d<Activity, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f48611a = nm0.h.b(new com.withings.wiscale2.activity.ui.k(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f48612b;

        public u(Activity activity) {
            this.f48612b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f48611a.getValue();
        }
    }

    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    static final class v extends w implements ym0.a<com.withings.wiscale2.activity.ui.n> {
        v() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.wiscale2.activity.ui.n invoke() {
            VasistasInfoActivity vasistasInfoActivity = VasistasInfoActivity.this;
            return (com.withings.wiscale2.activity.ui.n) new k1(vasistasInfoActivity, new ea0.u(vasistasInfoActivity)).a(com.withings.wiscale2.activity.ui.n.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B3(androidx.compose.ui.e eVar, Vasistas vasistas, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.runtime.b g11 = aVar.g(1100708493);
        androidx.compose.ui.e e11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
        g11.s(693286680);
        l0 a11 = a0.a.a(androidx.compose.foundation.layout.e.g(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            int i13 = 0;
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            g11.J();
            int i14 = i11 & 14;
            L3(eVar, vasistas, ((yk.w) androidx.appcompat.app.h.b(g11, 615317871)).g().c(), g11, i14 | 4160);
            int i15 = i14 | 4480;
            F3(eVar, String.valueOf(vasistas.getSleepLevel()), "Level", g11, i15);
            F3(eVar, String.valueOf(vasistas.getSnoringDurationRatio()), "Snore", g11, i15);
            Integer apneaHypopneaIndex = vasistas.getApneaHypopneaIndex();
            if (apneaHypopneaIndex != null) {
                i12 = apneaHypopneaIndex.intValue();
            } else {
                i12 = 0;
            }
            F3(eVar, String.valueOf(i12), "AHI", g11, i15);
            Integer breathingProbability = vasistas.getBreathingProbability();
            if (breathingProbability != null) {
                i13 = breathingProbability.intValue();
            }
            F3(eVar, String.valueOf(i13), "BdP", g11, i15);
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new c(eVar, vasistas, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C3(androidx.compose.ui.e eVar, Vasistas vasistas, androidx.compose.runtime.a aVar, int i11) {
        String str;
        String str2;
        androidx.compose.runtime.b g11 = aVar.g(119400432);
        androidx.compose.ui.e e11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
        g11.s(693286680);
        l0 a11 = a0.a.a(androidx.compose.foundation.layout.e.g(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            g11.J();
            int i12 = i11 & 14;
            L3(eVar, vasistas, ((yk.w) androidx.appcompat.app.h.b(g11, 615317871)).g().d(), g11, i12 | 4160);
            int hrState = vasistas.getHrState();
            if (hrState != 0) {
                if (hrState != 2) {
                    str = "Active";
                } else {
                    str = "Asleep";
                }
            } else {
                str = "Resting";
            }
            int i13 = i12 | 4480;
            F3(eVar, str, "Hr state", g11, i13);
            F3(eVar, String.valueOf(vasistas.getHeartRate()), "Hr", g11, i13);
            int hrLevel = vasistas.getHrLevel();
            if (hrLevel != 1) {
                if (hrLevel != 2) {
                    str2 = "Normal";
                } else {
                    str2 = "High";
                }
            } else {
                str2 = "Low";
            }
            F3(eVar, str2, "Hr level", g11, i13);
            F3(eVar, jm.a.c(a.d.a((Context) g11.D(u0.d())), 71, vasistas.getSkinTemperature(), 0, 0, 60).toString(), "Temperature", g11, i13);
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new d(eVar, vasistas, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3(androidx.compose.ui.e eVar, Vasistas vasistas, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(1018628153);
        SpannableStringBuilder c11 = jm.a.c(a.d.a((Context) g11.D(u0.d())), 71, vasistas.getCoreTemperature(), 0, 0, 60);
        androidx.compose.ui.e e11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
        g11.s(693286680);
        l0 a11 = a0.a.a(androidx.compose.foundation.layout.e.g(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c12 = androidx.compose.ui.layout.y.c(e11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            x.b(0, c12, j1.a(g11), g11, 2058660585);
            int i12 = i11 & 14;
            L3(eVar, vasistas, h0.c(4294954035L), g11, i12 | 4544);
            F3(eVar, c11.toString(), "Temperature", g11, i12 | 4480);
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new f(eVar, vasistas, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E3(Vasistas vasistas, String str, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(2027061990);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e j5 = x0.j(e1.e(aVar2, 1.0f), yk.h.o(), 0.0f, yk.h.o(), yk.h.d(), 2);
        g11.s(693286680);
        l0 a11 = a0.a.a(androidx.compose.foundation.layout.e.g(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(j5);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            b0 b0Var = b0.f94219a;
            nk.a.d(b0Var.b(e1.v(aVar2, b.a.k(), 2), 1.0f, true), w6.o.a(vasistas.getStartDate().toString("HH:mm:ss"), " - ", vasistas.getEnd().toString("HH:mm:ss")), 0L, null, 0, 0, null, g11, 0, 124);
            nk.a.g(0, 0, i11 & 112, 60, 0L, g11, b0Var.b(e1.v(aVar2, b.a.j(), 2), 1.0f, true), null, str);
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new g(vasistas, str, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F3(androidx.compose.ui.e eVar, String str, String str2, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.b g11 = aVar.g(432711286);
        if ((i11 & 14) == 0) {
            if (g11.K(eVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.K(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.K(str2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            d.a g12 = b.a.g();
            g11.s(-483455358);
            l0 a11 = androidx.compose.foundation.layout.n.a(androidx.compose.foundation.layout.e.h(), g12, g11);
            g11.s(-1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(eVar);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                x.b(0, c11, j1.a(g11), g11, 2058660585);
                nk.a.d(null, str, 0L, null, 0, 0, null, g11, i12 & 112, 125);
                nk.j.i(0, (i12 >> 3) & 112, 29, 0L, g11, null, null, str2);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new h(eVar, str, str2, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G3(androidx.compose.ui.e eVar, Vasistas vasistas, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(1365387228);
        androidx.compose.ui.e e11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
        int i12 = androidx.compose.foundation.layout.e.f4229i;
        e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.a());
        g11.s(693286680);
        l0 a11 = c1.a(o11, b.a.l(), g11);
        g11.s(-1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            g11.J();
            int i13 = i11 & 14;
            L3(eVar, vasistas, ((yk.w) androidx.appcompat.app.h.b(g11, 615317871)).g().e(), g11, i13 | 4160);
            int i14 = i13 | 4480;
            F3(eVar, String.valueOf(vasistas.getSteps()), "Steps", g11, i14);
            F3(eVar, jm.a.c(a.d.a((Context) g11.D(u0.d())), 40, vasistas.getAscent(), 0, 0, 60).toString(), "Ascent", g11, i14);
            F3(eVar, jm.a.c(a.d.a((Context) g11.D(u0.d())), 40, vasistas.getDistance(), 0, 0, 60).toString(), "Distance", g11, i14);
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new i(eVar, vasistas, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H3(androidx.compose.ui.e eVar, Vasistas vasistas, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-1028973512);
        androidx.compose.ui.e e11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
        g11.s(693286680);
        l0 a11 = a0.a.a(androidx.compose.foundation.layout.e.g(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            g11.J();
            int i12 = i11 & 14;
            L3(eVar, vasistas, ((yk.w) androidx.appcompat.app.h.b(g11, 615317871)).g().b(), g11, i12 | 4160);
            int i13 = i12 | 4480;
            F3(eVar, String.valueOf(vasistas.getPauseType()), "Pause type", g11, i13);
            F3(eVar, String.valueOf(vasistas.getDurationMillis() / 1000.0f), "Duration", g11, i13);
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new j(eVar, vasistas, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3(androidx.compose.ui.e eVar, Vasistas vasistas, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(138638450);
        androidx.compose.ui.e e11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
        g11.s(693286680);
        l0 a11 = a0.a.a(androidx.compose.foundation.layout.e.g(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            int i12 = i11 & 14;
            L3(eVar, vasistas, h0.c(4294940928L), g11, i12 | 4544);
            int i13 = i12 | 4480;
            F3(eVar, String.valueOf(vasistas.getSpo2()), "Value", g11, i13);
            F3(eVar, String.valueOf(vasistas.getSpo2Quality()), "Quality", g11, i13);
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new k(eVar, vasistas, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J3(androidx.compose.ui.e eVar, Vasistas vasistas, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-1048998966);
        androidx.compose.ui.e e11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
        g11.s(693286680);
        l0 a11 = a0.a.a(androidx.compose.foundation.layout.e.g(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            int i12 = i11 & 14;
            L3(eVar, vasistas, h0.c(4282782866L), g11, i12 | 4544);
            int i13 = i12 | 4480;
            F3(eVar, String.valueOf(vasistas.getSwimType()), "Swim Type", g11, i13);
            F3(eVar, String.valueOf(vasistas.getSwimLaps()), "Laps", g11, i13);
            F3(eVar, String.valueOf(vasistas.getSwimMovements()), "Movements", g11, i13);
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new l(eVar, vasistas, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K3(r0.a0 r15, boolean r16, java.lang.Boolean r17, androidx.compose.runtime.a r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.ui.VasistasInfoActivity.K3(r0.a0, boolean, java.lang.Boolean, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013c, code lost:
        if (r2 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L3(androidx.compose.ui.e r18, com.withings.vasistas.model.Vasistas r19, long r20, androidx.compose.runtime.a r22, int r23) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.ui.VasistasInfoActivity.L3(androidx.compose.ui.e, com.withings.vasistas.model.Vasistas, long, androidx.compose.runtime.a, int):void");
    }

    public static final void Q3(VasistasInfoActivity vasistasInfoActivity, androidx.compose.ui.e eVar, ActivityAggregate activityAggregate, List list, androidx.compose.runtime.a aVar, int i11) {
        vasistasInfoActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(1234959416);
        s0.a.a(e1.d(eVar), null, null, false, null, null, null, false, new com.withings.wiscale2.activity.ui.b(list, activityAggregate, vasistasInfoActivity), g11, 0, ConstantsWs.WS_STATUS_NOREPOUSER);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.wiscale2.activity.ui.c(vasistasInfoActivity, eVar, activityAggregate, list, i11));
        }
    }

    public static final void Y3(VasistasInfoActivity vasistasInfoActivity, Vasistas vasistas, fl.p pVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        vasistasInfoActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-429220249);
        if (pVar.j(vasistas.getDeviceModel()) == null) {
            bVar = g11;
        } else {
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e j5 = x0.j(aVar2, 0.0f, yk.h.b(), 0.0f, yk.h.b(), 5);
            g11.s(693286680);
            l0 a11 = a0.a.a(androidx.compose.foundation.layout.e.g(), g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(j5);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                x.b(0, c11, j1.a(g11), g11, 2058660585);
                b0 b0Var = b0.f94219a;
                androidx.compose.ui.e b11 = b0Var.b(aVar2, 0.9f, true);
                g11.s(-483455358);
                l0 b12 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
                int G2 = g11.G();
                v0 l6 = g11.l();
                ym0.a a13 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(b11);
                if (g11.i() instanceof k1.d) {
                    g11.A();
                    if (g11.e()) {
                        g11.F(a13);
                    } else {
                        g11.m();
                    }
                    ym0.p b13 = com.withings.authentication.e.b(g11, b12, g11, l6);
                    if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                        androidx.camera.camera2.internal.l0.d(G2, g11, G2, b13);
                    }
                    x.b(0, c12, j1.a(g11), g11, 2058660585);
                    vasistasInfoActivity.E3(vasistas, wy.a.f(vasistas.getDeviceModel(), vasistasInfoActivity), g11, ConstantsWs.WS_STATUS_ALREADY_EXIST);
                    androidx.compose.ui.e e11 = e1.e(aVar2, 1.0f);
                    if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        androidx.compose.ui.e n11 = e11.n(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true));
                        Vasistas.Category category = vasistas.getCategory();
                        if (category == null) {
                            i12 = -1;
                        } else {
                            i12 = o.f48604a[category.ordinal()];
                        }
                        switch (i12) {
                            case 1:
                                g11.s(-191319910);
                                vasistasInfoActivity.G3(n11, vasistas, g11, 576);
                                g11.J();
                                break;
                            case 2:
                                g11.s(-191319816);
                                vasistasInfoActivity.B3(n11, vasistas, g11, 576);
                                g11.J();
                                break;
                            case 3:
                                g11.s(-191319724);
                                vasistasInfoActivity.C3(n11, vasistas, g11, 576);
                                g11.J();
                                break;
                            case 4:
                                g11.s(-191319630);
                                vasistasInfoActivity.H3(n11, vasistas, g11, 576);
                                g11.J();
                                break;
                            case 5:
                                g11.s(-191319536);
                                vasistasInfoActivity.I3(n11, vasistas, g11, 576);
                                g11.J();
                                break;
                            case 6:
                                g11.s(-191319444);
                                vasistasInfoActivity.z3(n11, vasistas, g11, 576);
                                g11.J();
                                break;
                            case 7:
                                g11.s(-191319352);
                                vasistasInfoActivity.J3(n11, vasistas, g11, 576);
                                g11.J();
                                break;
                            case 8:
                                g11.s(-191319247);
                                vasistasInfoActivity.D3(n11, vasistas, g11, 576);
                                g11.J();
                                break;
                            default:
                                g11.s(-191319161);
                                g11.J();
                                break;
                        }
                        g11.J();
                        g11.o();
                        g11.J();
                        g11.J();
                        vasistasInfoActivity.K3(b0Var, vasistas.isSyncedToWs(), Boolean.valueOf(vasistas.isTrusted()), g11, 4102, 0);
                        g9.a(g11);
                        bVar = g11;
                        b2.a(0.0f, 0.0f, 0, 15, 0L, bVar, null);
                    } else {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                    }
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new com.withings.wiscale2.activity.ui.d(vasistasInfoActivity, vasistas, pVar, i11));
        }
    }

    public static final DateTime a4(VasistasInfoActivity vasistasInfoActivity) {
        return (DateTime) vasistasInfoActivity.f48548g.getValue(vasistasInfoActivity, f48541i[1]);
    }

    public static final fl.p b4(VasistasInfoActivity vasistasInfoActivity) {
        return (fl.p) vasistasInfoActivity.f48544c.getValue();
    }

    public static final User d4(VasistasInfoActivity vasistasInfoActivity) {
        return (User) vasistasInfoActivity.f48547f.getValue(vasistasInfoActivity, f48541i[0]);
    }

    public static final com.withings.wiscale2.activity.ui.n e4(VasistasInfoActivity vasistasInfoActivity) {
        return (com.withings.wiscale2.activity.ui.n) vasistasInfoActivity.f48542a.getValue();
    }

    private final String f4(double d11, int i11) {
        return jm.a.c((jm.a) this.f48545d.getValue(), i11, d11, 0, 0, 60).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z3(androidx.compose.ui.e eVar, Vasistas vasistas, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(1889773068);
        androidx.compose.ui.e e11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
        g11.s(693286680);
        l0 a11 = a0.a.a(androidx.compose.foundation.layout.e.g(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            int i12 = i11 & 14;
            L3(eVar, vasistas, h0.c(4280187782L), g11, i12 | 4544);
            F3(eVar, String.valueOf(vasistas.getApneaHypopneaIndex()), "Value", g11, i12 | 4480);
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new a(eVar, vasistas, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public final void A3(ActivityAggregate aggregate, androidx.compose.runtime.a aVar, int i11) {
        Integer num;
        kotlin.jvm.internal.u.j(aggregate, "aggregate");
        androidx.compose.runtime.b g11 = aVar.g(-794632740);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e i12 = x0.i(aVar2, yk.h.t(), yk.h.d(), yk.h.t(), yk.h.d());
        g11.s(693286680);
        l0 a11 = a0.a.a(androidx.compose.foundation.layout.e.g(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(i12);
        String str = null;
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            b0 b0Var = b0.f94219a;
            androidx.compose.ui.e b11 = b0Var.b(aVar2, 0.9f, true);
            g11.s(-483455358);
            l0 b12 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G2 = g11.G();
            v0 l6 = g11.l();
            ym0.a a13 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(b11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a13);
                } else {
                    g11.m();
                }
                ym0.p b13 = com.withings.authentication.e.b(g11, b12, g11, l6);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                    androidx.camera.camera2.internal.l0.d(G2, g11, G2, b13);
                }
                c12.invoke(j1.a(g11), g11, 0);
                g11.s(2058660585);
                androidx.compose.ui.e j5 = x0.j(aVar2, 0.0f, 0.0f, 0.0f, yk.h.q(), 7);
                nk.a0.f(0, 48, 28, 0L, g11, j5, null, "Aggregate");
                fl.o j11 = fl.p.f67672b.a().j(aggregate.getDeviceModel());
                if (j11 != null) {
                    num = Integer.valueOf(j11.I(null));
                } else {
                    num = null;
                }
                g11.s(2056966159);
                if (num != null) {
                    str = ay.b.u(num.intValue(), g11);
                }
                g11.J();
                if (str == null) {
                    str = DeviceInfo.STR_TYPE_UNKNOWN;
                }
                nk.j.i(0, 0, 28, 0L, g11, j5, null, "Device Model: " + aggregate.getDeviceModel() + " - " + str);
                nk.j.i(0, 0, 29, 0L, g11, null, null, androidx.activity.a0.b("Day: ", aggregate.getDay()));
                nk.j.i(0, 0, 29, 0L, g11, null, null, androidx.activity.a0.b("Midnight: ", aggregate.getMidnight().toString("dd-MM-yy HH:mm:ss")));
                nk.j.i(0, 0, 28, 0L, g11, j5, null, androidx.activity.a0.b("Timezone: ", aggregate.getTimezone()));
                nk.j.i(0, 0, 29, 0L, g11, null, null, androidx.activity.a0.b("Synchronization Time: ", aggregate.getSynchroTime().toString("dd-MM-yy HH:mm:ss")));
                nk.j.i(0, 0, 28, 0L, g11, j5, null, androidx.activity.a0.b("Modified: ", new DateTime(aggregate.getModified()).toString("dd-MM-yy HH:mm:ss")));
                nk.j.i(0, 0, 29, 0L, g11, null, null, android.support.v4.media.a.a("Steps: ", aggregate.getSteps()));
                nk.j.i(0, 0, 29, 0L, g11, null, null, androidx.activity.a0.b("Distance: ", f4(aggregate.getDistance(), 40)));
                nk.j.i(0, 0, 29, 0L, g11, null, null, androidx.activity.a0.b("Manual Addition Distance: ", f4(aggregate.getManualAdditionDistance(), 40)));
                nk.j.i(0, 0, 29, 0L, g11, null, null, androidx.activity.a0.b("Ascent: ", f4(aggregate.getAscent(), 40)));
                nk.j.i(0, 0, 29, 0L, g11, null, null, androidx.activity.a0.b("Descent: ", f4(aggregate.getDescent(), 40)));
                nk.j.i(0, 0, 29, 0L, g11, null, null, androidx.activity.a0.b("Calories: ", f4(aggregate.getCalories(), 48)));
                nk.j.i(0, 0, 29, 0L, g11, null, null, androidx.activity.a0.b("Earned Calories: ", f4(aggregate.getEarnedCalories(), 87)));
                nk.j.i(0, 0, 29, 0L, g11, null, null, androidx.activity.a0.b("Passive Calories: ", f4(aggregate.getPassiveCalories(), 49)));
                nk.j.i(0, 0, 28, 0L, g11, j5, null, androidx.activity.a0.b("Manual Addition Calories: ", f4(aggregate.getManualAdditionCalories(), 48)));
                nk.j.i(0, 0, 29, 0L, g11, null, null, androidx.activity.a0.b("Hr Average: ", f4(aggregate.getHrAverage(), 28)));
                nk.j.i(0, 0, 29, 0L, g11, null, null, androidx.activity.a0.b("Hr Resting: ", f4(aggregate.getHrResting(), 28)));
                nk.j.i(0, 0, 29, 0L, g11, null, null, androidx.activity.a0.b("Hr Min: ", f4(aggregate.getHrMin(), 28)));
                nk.j.i(0, 0, 29, 0L, g11, null, null, androidx.activity.a0.b("Hr Max: ", f4(aggregate.getHrMax(), 28)));
                nk.j.i(0, 0, 29, 0L, g11, null, null, android.support.v4.media.a.a("Hr Zone Light: ", aggregate.getHrZoneLight()));
                nk.j.i(0, 0, 29, 0L, g11, null, null, android.support.v4.media.a.a("Hr Zone Moderate: ", aggregate.getHrZoneModerate()));
                nk.j.i(0, 0, 29, 0L, g11, null, null, android.support.v4.media.a.a("Hr Zone Intense: ", aggregate.getHrZoneIntense()));
                nk.j.i(0, 0, 28, 0L, g11, j5, null, android.support.v4.media.a.a("Hr Zone Peak: ", aggregate.getHrZonePeak()));
                long inactiveDuration = aggregate.getInactiveDuration();
                nm0.g gVar = this.f48546e;
                nk.j.i(0, 0, 29, 0L, g11, null, null, "Inactive Duration: ".concat(((pm.e) gVar.getValue()).a(inactiveDuration)));
                nk.j.i(0, 0, 29, 0L, g11, null, null, "Soft MET Duration: ".concat(((pm.e) gVar.getValue()).a(aggregate.getSoftMETDuration())));
                nk.j.i(0, 0, 29, 0L, g11, null, null, "Moderate MET Duration: ".concat(((pm.e) gVar.getValue()).a(aggregate.getModerateMETDuration())));
                nk.j.i(0, 0, 28, 0L, g11, j5, null, "Intense MET Duration: ".concat(((pm.e) gVar.getValue()).a(aggregate.getIntenseMETDuration())));
                nk.j.i(0, 0, 29, 0L, g11, null, null, "Average SpO2: " + aggregate.getAverageSpO2());
                nk.j.i(0, 0, 29, 0L, g11, null, null, android.support.v4.media.a.a("Nb Auto SpO2 Measure: ", aggregate.getNbMeasureAuto()));
                nk.j.i(0, 0, 28, 0L, g11, j5, null, android.support.v4.media.a.a("Nb Manual SpO2 Measure: ", aggregate.getNbMeasureManual()));
                StringBuilder sb2 = new StringBuilder("Temperature average: ");
                sb2.append(aggregate.getTemperatureAverage().floatValue());
                nk.j.i(0, 0, 29, 0L, g11, null, null, sb2.toString());
                StringBuilder sb3 = new StringBuilder("Temperature min: ");
                sb3.append(aggregate.getTemperatureMin().floatValue());
                nk.j.i(0, 0, 29, 0L, g11, null, null, sb3.toString());
                StringBuilder sb4 = new StringBuilder("Temperature max: ");
                sb4.append(aggregate.getTemperatureMax().floatValue());
                nk.j.i(0, 0, 28, 0L, g11, j5, null, sb4.toString());
                nk.j.i(0, 0, 29, 0L, g11, null, null, "Is Completed: " + aggregate.isCompleted());
                g11.J();
                g11.o();
                g11.J();
                g11.J();
                K3(b0Var, aggregate.isSyncedToWs(), null, g11, 4102, 2);
                androidx.compose.runtime.v b14 = h6.b(g11);
                if (b14 != null) {
                    b14.G(new b(aggregate, i11));
                    return;
                }
                return;
            }
            a3.g.s();
            throw null;
        }
        a3.g.s();
        throw null;
    }

    @Override // com.withings.wiscale2.activity.ui.l.a
    public final void l(int i11, Vasistas.Category category) {
        this.f48543b = category;
        com.withings.wiscale2.activity.ui.n nVar = (com.withings.wiscale2.activity.ui.n) this.f48542a.getValue();
        Integer valueOf = Integer.valueOf(i11);
        Vasistas.Category category2 = this.f48543b;
        nVar.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(nVar), Dispatchers.getIO(), null, new com.withings.wiscale2.activity.ui.o(valueOf, category2, new p0(), nVar, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -1128142595, new s()));
        com.withings.wiscale2.activity.ui.n nVar = (com.withings.wiscale2.activity.ui.n) this.f48542a.getValue();
        Vasistas.Category category = Vasistas.Category.MOTION;
        nVar.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(nVar), Dispatchers.getIO(), null, new com.withings.wiscale2.activity.ui.o(0, category, new p0(), nVar, null), 2, null);
    }
}
