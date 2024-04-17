package com.withings.ecg.details;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.note.model.NoteGroup;
import com.withings.note.model.NoteRepository;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
/* compiled from: WaitingSignalResultActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/withings/ecg/details/WaitingSignalResultActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "c", "d", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WaitingSignalResultActivity extends Hilt_WaitingSignalResultActivity {

    /* renamed from: e  reason: collision with root package name */
    private final e f38055e = new e(this);

    /* renamed from: f  reason: collision with root package name */
    private final f f38056f = new f(this);
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public ch.d f38057g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public d f38058h;

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f38054j = {androidx.camera.core.v.c(WaitingSignalResultActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0), androidx.camera.core.v.c(WaitingSignalResultActivity.class, "timestamp", "getTimestamp()J", 0)};

    /* renamed from: i  reason: collision with root package name */
    public static final a f38053i = new Object();

    /* compiled from: WaitingSignalResultActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: WaitingSignalResultActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final HeartSignalMeasurement f38059a;

        /* renamed from: b  reason: collision with root package name */
        private final NoteGroup f38060b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f38061c;

        /* renamed from: d  reason: collision with root package name */
        private final User f38062d;

        public b(HeartSignalMeasurement heartSignalMeasurement, NoteGroup noteGroup, boolean z5, User user) {
            kotlin.jvm.internal.u.j(heartSignalMeasurement, "heartSignalMeasurement");
            kotlin.jvm.internal.u.j(noteGroup, "noteGroup");
            this.f38059a = heartSignalMeasurement;
            this.f38060b = noteGroup;
            this.f38061c = z5;
            this.f38062d = user;
        }

        public final boolean a() {
            return this.f38061c;
        }

        public final HeartSignalMeasurement b() {
            return this.f38059a;
        }

        public final User c() {
            return this.f38062d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (kotlin.jvm.internal.u.e(this.f38059a, bVar.f38059a) && kotlin.jvm.internal.u.e(this.f38060b, bVar.f38060b) && this.f38061c == bVar.f38061c && kotlin.jvm.internal.u.e(this.f38062d, bVar.f38062d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f38060b.hashCode();
            return this.f38062d.hashCode() + androidx.camera.core.y1.a(this.f38061c, (hashCode + (this.f38059a.hashCode() * 31)) * 31, 31);
        }

        public final String toString() {
            return "LoadedData(heartSignalMeasurement=" + this.f38059a + ", noteGroup=" + this.f38060b + ", hasInReview=" + this.f38061c + ", user=" + this.f38062d + ")";
        }
    }

    /* compiled from: WaitingSignalResultActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c extends androidx.lifecycle.b {

        /* renamed from: a  reason: collision with root package name */
        private final SharedFlow<HeartSignalMeasurement> f38063a;

        /* renamed from: b  reason: collision with root package name */
        private final Flow<NoteGroup> f38064b;

        /* renamed from: c  reason: collision with root package name */
        private final SharedFlow<b> f38065c;

        /* compiled from: WaitingSignalResultActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.WaitingSignalResultActivity$WaitingSignalViewModel$loadedData$1", f = "WaitingSignalResultActivity.kt", l = {122, 123}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.q<HeartSignalMeasurement, NoteGroup, qm0.d<? super b>, Object> {

            /* renamed from: a  reason: collision with root package name */
            boolean f38066a;

            /* renamed from: b  reason: collision with root package name */
            int f38067b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ HeartSignalMeasurement f38068c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ NoteGroup f38069d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ HeartSignalRepository f38070e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ long f38071f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ m70.i f38072g;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: WaitingSignalResultActivity.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.WaitingSignalResultActivity$WaitingSignalViewModel$loadedData$1$hasInReview$1", f = "WaitingSignalResultActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.withings.ecg.details.WaitingSignalResultActivity$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0500a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Boolean>, Object> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ HeartSignalRepository f38073a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ long f38074b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ HeartSignalMeasurement f38075c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0500a(HeartSignalRepository heartSignalRepository, long j5, HeartSignalMeasurement heartSignalMeasurement, qm0.d<? super C0500a> dVar) {
                    super(2, dVar);
                    this.f38073a = heartSignalRepository;
                    this.f38074b = j5;
                    this.f38075c = heartSignalMeasurement;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                    return new C0500a(this.f38073a, this.f38074b, this.f38075c, dVar);
                }

                @Override // ym0.p
                public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Boolean> dVar) {
                    return ((C0500a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                    nm0.l.b(obj);
                    return Boolean.valueOf(this.f38073a.hasInReviewEcg(this.f38074b, this.f38075c.getDeviceId()));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: WaitingSignalResultActivity.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.WaitingSignalResultActivity$WaitingSignalViewModel$loadedData$1$user$1", f = "WaitingSignalResultActivity.kt", l = {}, m = "invokeSuspend")
            /* loaded from: classes3.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super User>, Object> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ m70.i f38076a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ long f38077b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(m70.i iVar, long j5, qm0.d<? super b> dVar) {
                    super(2, dVar);
                    this.f38076a = iVar;
                    this.f38077b = j5;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                    return new b(this.f38076a, this.f38077b, dVar);
                }

                @Override // ym0.p
                public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super User> dVar) {
                    return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                    nm0.l.b(obj);
                    return this.f38076a.i(this.f38077b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HeartSignalRepository heartSignalRepository, long j5, m70.i iVar, qm0.d<? super a> dVar) {
                super(3, dVar);
                this.f38070e = heartSignalRepository;
                this.f38071f = j5;
                this.f38072g = iVar;
            }

            @Override // ym0.q
            public final Object invoke(HeartSignalMeasurement heartSignalMeasurement, NoteGroup noteGroup, qm0.d<? super b> dVar) {
                a aVar = new a(this.f38070e, this.f38071f, this.f38072g, dVar);
                aVar.f38068c = heartSignalMeasurement;
                aVar.f38069d = noteGroup;
                return aVar.invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                NoteGroup noteGroup;
                HeartSignalMeasurement heartSignalMeasurement;
                boolean z5;
                HeartSignalMeasurement heartSignalMeasurement2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f38067b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            z5 = this.f38066a;
                            noteGroup = this.f38069d;
                            heartSignalMeasurement2 = this.f38068c;
                            nm0.l.b(obj);
                            User user = (User) obj;
                            kotlin.jvm.internal.u.g(user);
                            return new b(heartSignalMeasurement2, noteGroup, z5, user);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    noteGroup = this.f38069d;
                    heartSignalMeasurement = this.f38068c;
                    nm0.l.b(obj);
                } else {
                    nm0.l.b(obj);
                    HeartSignalMeasurement heartSignalMeasurement3 = this.f38068c;
                    noteGroup = this.f38069d;
                    if (heartSignalMeasurement3 == null || noteGroup == null) {
                        return null;
                    }
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    C0500a c0500a = new C0500a(this.f38070e, this.f38071f, heartSignalMeasurement3, null);
                    this.f38068c = heartSignalMeasurement3;
                    this.f38069d = noteGroup;
                    this.f38067b = 1;
                    Object withContext = BuildersKt.withContext(io2, c0500a, this);
                    if (withContext == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    heartSignalMeasurement = heartSignalMeasurement3;
                    obj = withContext;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                CoroutineDispatcher io3 = Dispatchers.getIO();
                b bVar = new b(this.f38072g, this.f38071f, null);
                this.f38068c = heartSignalMeasurement;
                this.f38069d = noteGroup;
                this.f38066a = booleanValue;
                this.f38067b = 2;
                Object withContext2 = BuildersKt.withContext(io3, bVar, this);
                if (withContext2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z5 = booleanValue;
                obj = withContext2;
                heartSignalMeasurement2 = heartSignalMeasurement;
                User user2 = (User) obj;
                kotlin.jvm.internal.u.g(user2);
                return new b(heartSignalMeasurement2, noteGroup, z5, user2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WaitingSignalResultActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.WaitingSignalResultActivity$WaitingSignalViewModel$noteGroupForEcgId$1$1", f = "WaitingSignalResultActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Flow<? extends NoteGroup>>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ HeartSignalMeasurement f38078a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ NoteRepository f38079b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(HeartSignalMeasurement heartSignalMeasurement, NoteRepository noteRepository, qm0.d<? super b> dVar) {
                super(2, dVar);
                this.f38078a = heartSignalMeasurement;
                this.f38079b = noteRepository;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new b(this.f38078a, this.f38079b, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Flow<? extends NoteGroup>> dVar) {
                return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Flow a11;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                HeartSignalMeasurement heartSignalMeasurement = this.f38078a;
                if (heartSignalMeasurement == null || (a11 = androidx.lifecycle.q.a(this.f38079b.getLocalNoteGroupLiveDataForId(heartSignalMeasurement.getId()))) == null) {
                    return FlowKt.flowOf(null);
                }
                return a11;
            }
        }

        /* compiled from: Merge.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.WaitingSignalResultActivity$WaitingSignalViewModel$special$$inlined$flatMapLatest$1", f = "WaitingSignalResultActivity.kt", l = {219, 193}, m = "invokeSuspend")
        /* renamed from: com.withings.ecg.details.WaitingSignalResultActivity$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0501c extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super NoteGroup>, HeartSignalMeasurement, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f38080a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ FlowCollector f38081b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f38082c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ NoteRepository f38083d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0501c(qm0.d dVar, NoteRepository noteRepository) {
                super(3, dVar);
                this.f38083d = noteRepository;
            }

            @Override // ym0.q
            public final Object invoke(FlowCollector<? super NoteGroup> flowCollector, HeartSignalMeasurement heartSignalMeasurement, qm0.d<? super nm0.y> dVar) {
                C0501c c0501c = new C0501c(dVar, this.f38083d);
                c0501c.f38081b = flowCollector;
                c0501c.f38082c = heartSignalMeasurement;
                return c0501c.invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                FlowCollector flowCollector;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f38080a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            nm0.l.b(obj);
                            return nm0.y.f85009a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = this.f38081b;
                    nm0.l.b(obj);
                } else {
                    nm0.l.b(obj);
                    flowCollector = this.f38081b;
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    b bVar = new b((HeartSignalMeasurement) this.f38082c, this.f38083d, null);
                    this.f38081b = flowCollector;
                    this.f38080a = 1;
                    obj = BuildersKt.withContext(io2, bVar, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                this.f38081b = null;
                this.f38080a = 2;
                if (FlowKt.emitAll(flowCollector, (Flow) obj, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Application application, HeartSignalRepository heartSignalRepository, NoteRepository noteRepository, m70.i userManager, long j5, long j11) {
            super(application);
            kotlin.jvm.internal.u.j(heartSignalRepository, "heartSignalRepository");
            kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
            kotlin.jvm.internal.u.j(userManager, "userManager");
            Flow flowOn = FlowKt.flowOn(heartSignalRepository.getByTimestampAndTypeFlow(j5, j11, 1, 6, 8, 7, 13), Dispatchers.getIO());
            CoroutineScope a11 = androidx.lifecycle.h1.a(this);
            SharingStarted.Companion companion = SharingStarted.Companion;
            SharedFlow<HeartSignalMeasurement> shareIn = FlowKt.shareIn(flowOn, a11, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
            this.f38063a = shareIn;
            Flow<NoteGroup> transformLatest = FlowKt.transformLatest(shareIn, new C0501c(null, noteRepository));
            this.f38064b = transformLatest;
            this.f38065c = FlowKt.shareIn(FlowKt.combine(shareIn, transformLatest, new a(heartSignalRepository, j5, userManager, null)), androidx.lifecycle.h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        }

        public final SharedFlow<b> f0() {
            return this.f38065c;
        }
    }

    /* compiled from: WaitingSignalResultActivity.kt */
    /* loaded from: classes3.dex */
    public interface d {
        c a(long j5, long j11);
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f38084a = nm0.h.b(new w2(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f38085b;

        public e(Activity activity) {
            this.f38085b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f38084a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class f implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f38086a = nm0.h.b(new x2(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f38087b;

        public f(Activity activity) {
            this.f38087b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f38086a.getValue();
        }
    }

    public static final long A3(WaitingSignalResultActivity waitingSignalResultActivity) {
        return ((Number) waitingSignalResultActivity.f38055e.getValue(waitingSignalResultActivity, f38054j[0])).longValue();
    }

    public static final long z3(WaitingSignalResultActivity waitingSignalResultActivity) {
        return ((Number) waitingSignalResultActivity.f38056f.getValue(waitingSignalResultActivity, f38054j[1])).longValue();
    }

    @Override // com.withings.ecg.details.Hilt_WaitingSignalResultActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_waiting_signal_sync);
        FlowKt.launchIn(FlowKt.onEach(((c) new androidx.lifecycle.k1(this, new u2(this)).a(c.class)).f0(), new v2(this, null)), m0.t.l(this));
    }
}
