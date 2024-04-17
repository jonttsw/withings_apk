package com.withings.wiscale2.chat.ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.core.s1;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.q;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import com.withings.leaderboard.utils.LeaderboardMessageType;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.spo2.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/chat/ui/ChatFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/text/TextWatcher;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class ChatFragment extends Fragment implements TextWatcher {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f50346t = 0;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f50347c;

    /* renamed from: d  reason: collision with root package name */
    public AppCompatEditText f50348d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f50349e;

    /* renamed from: f  reason: collision with root package name */
    public LinearLayout f50350f;

    /* renamed from: g  reason: collision with root package name */
    public ComposeView f50351g;

    /* renamed from: h  reason: collision with root package name */
    public ComposeView f50352h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f50353i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f50354j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f50355k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f50356l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f50357m;

    /* renamed from: n  reason: collision with root package name */
    public TextView f50358n;

    /* renamed from: o  reason: collision with root package name */
    private LeaderboardEntry f50359o;

    /* renamed from: p  reason: collision with root package name */
    private LeaderboardEntry f50360p;

    /* renamed from: q  reason: collision with root package name */
    private f f50361q = new f(0);

    /* renamed from: r  reason: collision with root package name */
    private boolean f50362r;

    /* renamed from: s  reason: collision with root package name */
    private a f50363s;

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes4.dex */
    public interface a {
        void V(ob0.b bVar);
    }

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f50364a;

        static {
            int[] iArr = new int[LeaderboardMessageType.values().length];
            try {
                iArr[LeaderboardMessageType.CUSTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LeaderboardMessageType.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LeaderboardMessageType.CHEER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LeaderboardMessageType.TAUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f50364a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.chat.ui.ChatFragment$loadDataAndRefresh$1$1", f = "ChatFragment.kt", l = {ConstantsWs.MEASURE_TYPE_NITRITES}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f50365a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LeaderboardEntry f50367c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatFragment.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.chat.ui.ChatFragment$loadDataAndRefresh$1$1$items$1", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super List<ob0.b>>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ LeaderboardEntry f50368a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LeaderboardEntry leaderboardEntry, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f50368a = leaderboardEntry;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f50368a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<ob0.b>> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                new m();
                LeaderboardEntry leaderboardEntry = this.f50368a;
                u.j(leaderboardEntry, "leaderboardEntry");
                return ob0.a.b(leaderboardEntry.getUserid());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(LeaderboardEntry leaderboardEntry, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f50367c = leaderboardEntry;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f50367c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f50365a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(this.f50367c, null);
                this.f50365a = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            List<? extends ob0.b> list = (List) obj;
            ChatFragment chatFragment = ChatFragment.this;
            f fVar = chatFragment.f50361q;
            u.g(list);
            fVar.f(list);
            chatFragment.f50361q.notifyDataSetChanged();
            ChatFragment.x1(chatFragment);
            return y.f85009a;
        }
    }

    private final void A1(LeaderboardMessageType leaderboardMessageType) {
        String string;
        int i11;
        boolean z5;
        User e11 = m70.i.b().e();
        u.i(e11, "getMainUser(...)");
        LeaderboardEntry leaderboardEntry = this.f50359o;
        if (leaderboardEntry != null) {
            String valueOf = String.valueOf(y1().getText());
            int length = valueOf.length() - 1;
            int i12 = 0;
            boolean z11 = false;
            while (i12 <= length) {
                if (!z11) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (u.l(valueOf.charAt(i11), 32) <= 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z11) {
                    if (!z5) {
                        z11 = true;
                    } else {
                        i12++;
                    }
                } else if (!z5) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = valueOf.subSequence(i12, length + 1).toString();
            int i13 = b.f50364a[leaderboardMessageType.ordinal()];
            if (i13 != 1 && i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        Fail.j("We don't have any message for message type : " + leaderboardMessageType);
                        string = null;
                    } else {
                        string = getString(C1987R.string._LB_TAUNT_MESSAGE_, e11.l());
                    }
                } else {
                    string = getString(C1987R.string._LB_CHEER_MESSAGE_, e11.l());
                }
            } else if (TextUtils.isEmpty(obj)) {
                return;
            } else {
                string = getString(C1987R.string._LB_CUSTOM_MESSAGE_, e11.l(), obj);
            }
            y1().setText("");
            ob0.b bVar = new ob0.b(DateTime.now().getMillis(), e11.q(), leaderboardEntry.getUserid(), new ob0.c(string, obj, 1, leaderboardMessageType));
            a aVar = this.f50363s;
            if (aVar != null) {
                aVar.V(bVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Friend is not loaded yet");
    }

    public static void s1(ChatFragment this$0) {
        u.j(this$0, "this$0");
        this$0.A1(LeaderboardMessageType.TAUNT);
    }

    public static void t1(ChatFragment this$0) {
        u.j(this$0, "this$0");
        this$0.A1(LeaderboardMessageType.CHEER);
    }

    public static void u1(ChatFragment this$0) {
        u.j(this$0, "this$0");
        this$0.A1(LeaderboardMessageType.MESSAGE);
    }

    public static boolean v1(ChatFragment this$0, int i11) {
        u.j(this$0, "this$0");
        if (i11 == 6) {
            this$0.A1(LeaderboardMessageType.MESSAGE);
            this$0.y1().setText("");
            return true;
        }
        return false;
    }

    public static final void x1(ChatFragment chatFragment) {
        f fVar = chatFragment.f50361q;
        fVar.notifyDataSetChanged();
        if (!fVar.d().isEmpty()) {
            RecyclerView recyclerView = chatFragment.f50347c;
            if (recyclerView != null) {
                recyclerView.w0(0);
            } else {
                u.s("chatRecyclerview");
                throw null;
            }
        }
        cr.a.a(new nm0.j(chatFragment.f50360p, chatFragment.f50359o), new h(chatFragment));
    }

    public final void B1(a callback) {
        u.j(callback, "callback");
        this.f50363s = callback;
    }

    public final void C1(boolean z5) {
        this.f50362r = z5;
        if (z5) {
            y1().requestFocus();
            y1().postDelayed(new s1(this, 3), 300L);
        }
    }

    public final void D1(LeaderboardEntry leaderboardEntry, LeaderboardEntry leaderboardEntry2) {
        this.f50359o = leaderboardEntry;
        this.f50360p = leaderboardEntry2;
        this.f50361q.e(leaderboardEntry, leaderboardEntry2);
        z1();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_chat, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        vh.h.b(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        z1();
        super.onResume();
        if (this.f50362r) {
            y1().requestFocus();
            y1().postDelayed(new s1(this, 3), 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence sequence, int i11, int i12, int i13) {
        u.j(sequence, "sequence");
        if (sequence.length() == 0) {
            ImageView imageView = this.f50349e;
            if (imageView != null) {
                imageView.setVisibility(8);
                LinearLayout linearLayout = this.f50350f;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    return;
                } else {
                    u.s("layoutCheerTaunt");
                    throw null;
                }
            }
            u.s("sendText");
            throw null;
        }
        LinearLayout linearLayout2 = this.f50350f;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
            ImageView imageView2 = this.f50349e;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
                return;
            } else {
                u.s("sendText");
                throw null;
            }
        }
        u.s("layoutCheerTaunt");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C1987R.id.chatList);
        u.i(findViewById, "findViewById(...)");
        this.f50347c = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.editTextMessage);
        u.i(findViewById2, "findViewById(...)");
        this.f50348d = (AppCompatEditText) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.send_text);
        u.i(findViewById3, "findViewById(...)");
        this.f50349e = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.layout_cheer_taunt);
        u.i(findViewById4, "findViewById(...)");
        this.f50350f = (LinearLayout) findViewById4;
        View findViewById5 = view.findViewById(C1987R.id.friend_image);
        u.i(findViewById5, "findViewById(...)");
        this.f50351g = (ComposeView) findViewById5;
        View findViewById6 = view.findViewById(C1987R.id.user_image);
        u.i(findViewById6, "findViewById(...)");
        this.f50352h = (ComposeView) findViewById6;
        View findViewById7 = view.findViewById(C1987R.id.friend_score);
        u.i(findViewById7, "findViewById(...)");
        this.f50353i = (TextView) findViewById7;
        View findViewById8 = view.findViewById(C1987R.id.user_score);
        u.i(findViewById8, "findViewById(...)");
        this.f50354j = (TextView) findViewById8;
        View findViewById9 = view.findViewById(C1987R.id.friend_name);
        u.i(findViewById9, "findViewById(...)");
        this.f50355k = (TextView) findViewById9;
        View findViewById10 = view.findViewById(C1987R.id.user_name);
        u.i(findViewById10, "findViewById(...)");
        this.f50356l = (TextView) findViewById10;
        View findViewById11 = view.findViewById(C1987R.id.glyph_taunt);
        u.i(findViewById11, "findViewById(...)");
        this.f50357m = (TextView) findViewById11;
        View findViewById12 = view.findViewById(C1987R.id.glyph_cheer);
        u.i(findViewById12, "findViewById(...)");
        this.f50358n = (TextView) findViewById12;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.C1(true);
        RecyclerView recyclerView = this.f50347c;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
            RecyclerView recyclerView2 = this.f50347c;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f50361q);
                y1().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.withings.wiscale2.chat.ui.g
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                        return ChatFragment.v1(ChatFragment.this, i11);
                    }
                });
                y1().addTextChangedListener(this);
                TextView textView = this.f50357m;
                if (textView != null) {
                    textView.setOnClickListener(new sg.d(this, 5));
                    TextView textView2 = this.f50358n;
                    if (textView2 != null) {
                        textView2.setOnClickListener(new q(this, 4));
                        ImageView imageView = this.f50349e;
                        if (imageView != null) {
                            imageView.setOnClickListener(new sg.j(this, 6));
                            return;
                        } else {
                            u.s("sendText");
                            throw null;
                        }
                    }
                    u.s("glyphCheer");
                    throw null;
                }
                u.s("glyphTaunt");
                throw null;
            }
            u.s("chatRecyclerview");
            throw null;
        }
        u.s("chatRecyclerview");
        throw null;
    }

    public final AppCompatEditText y1() {
        AppCompatEditText appCompatEditText = this.f50348d;
        if (appCompatEditText != null) {
            return appCompatEditText;
        }
        u.s("editTextMessage");
        throw null;
    }

    public final void z1() {
        LeaderboardEntry leaderboardEntry = this.f50359o;
        if (leaderboardEntry != null) {
            BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getMain(), null, new c(leaderboardEntry, null), 2, null);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
