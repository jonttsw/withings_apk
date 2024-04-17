package com.withings.wiscale2.chat.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.leaderboard.domain.LeaderboardManager;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.chat.ui.ChatFragment;
import com.withings.wiscale2.spo2.m;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import th0.k;
import ym0.p;
/* compiled from: ChatActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/chat/ui/ChatActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/chat/ui/ChatFragment$a;", "Lcom/withings/core/data/aggregate/ActivityAggregateManager$Listener;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ChatActivity extends Hilt_ChatActivity implements ChatFragment.a, ActivityAggregateManager.Listener {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ int f50318q = 0;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public k f50321g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public LeaderboardRemoteRepository f50322h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public ActivityAggregateManager f50323i;

    /* renamed from: j  reason: collision with root package name */
    private LeaderboardEntry f50324j;

    /* renamed from: k  reason: collision with root package name */
    private LeaderboardEntry f50325k;

    /* renamed from: m  reason: collision with root package name */
    private Long f50327m;

    /* renamed from: n  reason: collision with root package name */
    private ProgressDialog f50328n;

    /* renamed from: o  reason: collision with root package name */
    private ob0.b f50329o;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f50319e = nm0.h.b(new g());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f50320f = nm0.h.b(new b());

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f50326l = nm0.h.b(new c());

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f50330p = nm0.h.b(d.f50335a);

    /* compiled from: ChatActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final LeaderboardEntry f50331a;

        /* renamed from: b  reason: collision with root package name */
        private final LeaderboardEntry f50332b;

        public a(LeaderboardEntry leaderboardEntry, LeaderboardEntry leaderboardEntry2) {
            this.f50331a = leaderboardEntry;
            this.f50332b = leaderboardEntry2;
        }

        public final LeaderboardEntry a() {
            return this.f50332b;
        }

        public final LeaderboardEntry b() {
            return this.f50331a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (u.e(this.f50331a, aVar.f50331a) && u.e(this.f50332b, aVar.f50332b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i11 = 0;
            LeaderboardEntry leaderboardEntry = this.f50331a;
            if (leaderboardEntry == null) {
                hashCode = 0;
            } else {
                hashCode = leaderboardEntry.hashCode();
            }
            int i12 = hashCode * 31;
            LeaderboardEntry leaderboardEntry2 = this.f50332b;
            if (leaderboardEntry2 != null) {
                i11 = leaderboardEntry2.hashCode();
            }
            return i12 + i11;
        }

        public final String toString() {
            return "ChatData(me=" + this.f50331a + ", friend=" + this.f50332b + ")";
        }
    }

    /* compiled from: ChatActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.a<ChatFragment> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final ChatFragment invoke() {
            Fragment Y = ChatActivity.this.getSupportFragmentManager().Y("chat_fragment");
            u.h(Y, "null cannot be cast to non-null type com.withings.wiscale2.chat.ui.ChatFragment");
            return (ChatFragment) Y;
        }
    }

    /* compiled from: ChatActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.a<Boolean> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(ChatActivity.this.getIntent().getBooleanExtra("key_for_answer", false));
        }
    }

    /* compiled from: ChatActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends w implements ym0.a<LeaderboardManager> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f50335a = new w(0);

        @Override // ym0.a
        public final LeaderboardManager invoke() {
            return LeaderboardManager.Companion.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.chat.ui.ChatActivity$loadAndShowData$1", f = "ChatActivity.kt", l = {117}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        ChatActivity f50336a;

        /* renamed from: b  reason: collision with root package name */
        int f50337b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.chat.ui.ChatActivity$loadAndShowData$1$1", f = "ChatActivity.kt", l = {117}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super a>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f50339a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ChatActivity f50340b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ChatActivity chatActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f50340b = chatActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f50340b, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super a> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f50339a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    l.b(obj);
                    this.f50339a = 1;
                    obj = ChatActivity.B3(this.f50340b, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return obj;
            }
        }

        e(qm0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new e(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ChatActivity chatActivity;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f50337b;
            if (i11 != 0) {
                if (i11 == 1) {
                    chatActivity = this.f50336a;
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                ChatActivity chatActivity2 = ChatActivity.this;
                a aVar = new a(chatActivity2, null);
                this.f50336a = chatActivity2;
                this.f50337b = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chatActivity = chatActivity2;
            }
            ChatActivity.C3(chatActivity, (a) obj);
            return y.f85009a;
        }
    }

    /* compiled from: ChatActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.chat.ui.ChatActivity$pushMessage$1", f = "ChatActivity.kt", l = {ConstantsWs.MEASURE_TYPE_PWV_REACHED_COUNT}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f50341a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ob0.b f50343c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.chat.ui.ChatActivity$pushMessage$1$1", f = "ChatActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ChatActivity f50344a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ChatActivity chatActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f50344a = chatActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f50344a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                new m();
                ob0.b bVar = this.f50344a.f50329o;
                if (bVar != null) {
                    ob0.a.c(bVar);
                    return y.f85009a;
                }
                u.s("currentItemChat");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ob0.b bVar, qm0.d<? super f> dVar) {
            super(2, dVar);
            this.f50343c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new f(this.f50343c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f50341a;
            ChatActivity chatActivity = ChatActivity.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(chatActivity, null);
                this.f50341a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            int i12 = ChatActivity.f50318q;
            chatActivity.getClass();
            BuildersKt__Builders_commonKt.launch$default(t.l(chatActivity), null, null, new com.withings.wiscale2.chat.ui.d(chatActivity, this.f50343c, null), 3, null);
            return y.f85009a;
        }
    }

    /* compiled from: ChatActivity.kt */
    /* loaded from: classes4.dex */
    static final class g extends w implements ym0.a<Toolbar> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) ChatActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B3(com.withings.wiscale2.chat.ui.ChatActivity r18, qm0.d r19) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.chat.ui.ChatActivity.B3(com.withings.wiscale2.chat.ui.ChatActivity, qm0.d):java.lang.Object");
    }

    public static final void C3(ChatActivity chatActivity, a aVar) {
        LeaderboardEntry b10;
        chatActivity.getClass();
        if (aVar.a() == null || aVar.b() == null) {
            chatActivity.finish();
        }
        LeaderboardEntry a11 = aVar.a();
        if (a11 != null && (b10 = aVar.b()) != null) {
            chatActivity.f50325k = a11;
            chatActivity.f50324j = b10;
            ((ChatFragment) chatActivity.f50320f.getValue()).D1(a11, b10);
            ProgressDialog progressDialog = chatActivity.f50328n;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            chatActivity.f50328n = null;
        }
    }

    private final void D3() {
        ProgressDialog progressDialog = this.f50328n;
        if (progressDialog != null && (!progressDialog.isShowing())) {
            this.f50328n = ProgressDialog.show(this, null, getString(C1987R.string._LOADING_), true, false);
        }
        BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new e(null), 3, null);
    }

    public static final ChatFragment z3(ChatActivity chatActivity) {
        return (ChatFragment) chatActivity.f50320f.getValue();
    }

    @Override // com.withings.wiscale2.chat.ui.ChatFragment.a
    public final void V(ob0.b bVar) {
        this.f50329o = bVar;
        BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new f(bVar, null), 3, null);
    }

    @Override // com.withings.core.data.aggregate.ActivityAggregateManager.Listener
    public final void onAggregateInserted(long j5, ActivityAggregate aggregate) {
        u.j(aggregate, "aggregate");
    }

    @Override // com.withings.core.data.aggregate.ActivityAggregateManager.Listener
    public final void onAggregateUpdated(long j5, ActivityAggregate aggregate) {
        u.j(aggregate, "aggregate");
        if (u.e(aggregate.getMidnight().withDayOfWeek(1), DateTime.now().withTimeAtStartOfDay().withDayOfWeek(1))) {
            D3();
        }
    }

    @Override // com.withings.wiscale2.chat.ui.Hilt_ChatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("fromNotification")) {
            if (this.f50321g != null) {
                k.b(getIntent().getExtras());
            } else {
                u.s("pushNotificationManager");
                throw null;
            }
        }
        setContentView(C1987R.layout.activity_chat);
        setSupportActionBar((Toolbar) this.f50319e.getValue());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        nm0.g gVar = this.f50320f;
        ((ChatFragment) gVar.getValue()).B1(this);
        LeaderboardEntry leaderboardEntry = this.f50325k;
        LeaderboardEntry leaderboardEntry2 = this.f50324j;
        if (leaderboardEntry != null && leaderboardEntry2 != null) {
            this.f50327m = Long.valueOf(leaderboardEntry.getUserid());
            ((ChatFragment) gVar.getValue()).D1(leaderboardEntry, leaderboardEntry2);
        } else {
            this.f50327m = Long.valueOf(getIntent().getLongExtra("key_friend_id", -1L));
            D3();
        }
        ((ChatFragment) gVar.getValue()).C1(((Boolean) this.f50326l.getValue()).booleanValue());
        ActivityAggregateManager activityAggregateManager = this.f50323i;
        if (activityAggregateManager != null) {
            activityAggregateManager.addMainThreadListener(this);
        } else {
            u.s("activityAggregateManager");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.chat.ui.Hilt_ChatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        ActivityAggregateManager activityAggregateManager = this.f50323i;
        if (activityAggregateManager != null) {
            activityAggregateManager.removeListener(this);
            super.onDestroy();
            return;
        }
        u.s("activityAggregateManager");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
