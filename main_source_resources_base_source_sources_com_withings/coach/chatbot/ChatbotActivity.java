package com.withings.coach.chatbot;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.insight.android.entity.Conversation;
import com.withings.insight.android.entity.InputMetadata;
import com.withings.insight.android.entity.Insight;
import com.withings.insight.android.entity.Suggestion;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: ChatbotActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/coach/chatbot/ChatbotActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "coach_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ChatbotActivity extends Hilt_ChatbotActivity {
    private Conversation A;
    private ValueAnimator B;
    @Inject
    public t0 F;

    /* renamed from: s  reason: collision with root package name */
    private WebView f32927s;

    /* renamed from: w  reason: collision with root package name */
    private ArrayList f32931w;

    /* renamed from: x  reason: collision with root package name */
    private p0 f32932x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f32933y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f32934z;
    static final /* synthetic */ fn0.k<Object>[] M = {androidx.camera.core.v.c(ChatbotActivity.class, "initialInsight", "getInitialInsight()Lcom/withings/insight/android/entity/Insight;", 0)};
    public static final a G = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f32913e = nm0.h.b(new g());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f32914f = nm0.h.b(new q());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f32915g = nm0.h.b(new c());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f32916h = nm0.h.b(new d());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f32917i = nm0.h.b(new n());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f32918j = nm0.h.b(new o());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f32919k = nm0.h.b(new i());

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f32920l = nm0.h.b(new j());

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f32921m = nm0.h.b(new k());

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f32922n = nm0.h.b(new e());

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f32923o = nm0.h.b(new f());

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f32924p = nm0.h.b(new p());

    /* renamed from: q  reason: collision with root package name */
    private final nm0.g f32925q = nm0.h.b(new l());

    /* renamed from: r  reason: collision with root package name */
    private final nm0.g f32926r = nm0.h.b(new r());

    /* renamed from: t  reason: collision with root package name */
    private final m f32928t = new m(this);

    /* renamed from: u  reason: collision with root package name */
    private final j0 f32929u = new j0(new b());

    /* renamed from: v  reason: collision with root package name */
    private final i1 f32930v = new i1(new h());

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            ChatbotActivity.P3(ChatbotActivity.this, num.intValue());
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<RecyclerView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final RecyclerView invoke() {
            return (RecyclerView) ChatbotActivity.this.findViewById(C1987R.id.conversation);
        }
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<FrameLayout> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final FrameLayout invoke() {
            return (FrameLayout) ChatbotActivity.this.findViewById(C1987R.id.conversation_container);
        }
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<DateTimePicker> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final DateTimePicker invoke() {
            return (DateTimePicker) ChatbotActivity.this.findViewById(C1987R.id.date_picker_layout);
        }
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<EditText> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final EditText invoke() {
            return (EditText) ChatbotActivity.this.findViewById(C1987R.id.edit_text);
        }
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<MotionLayout> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final MotionLayout invoke() {
            return (MotionLayout) ChatbotActivity.this.findViewById(C1987R.id.motion_layout);
        }
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.p<Suggestion, Boolean, nm0.y> {
        h() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(Suggestion suggestion, Boolean bool) {
            Suggestion suggestion2 = suggestion;
            boolean booleanValue = bool.booleanValue();
            kotlin.jvm.internal.u.j(suggestion2, "suggestion");
            ChatbotActivity.T3(ChatbotActivity.this, suggestion2, booleanValue);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<RecyclerView> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final RecyclerView invoke() {
            return (RecyclerView) ChatbotActivity.this.findViewById(C1987R.id.suggestions_recyclerview);
        }
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<Button> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final Button invoke() {
            return (Button) ChatbotActivity.this.findViewById(C1987R.id.next_suggestion);
        }
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.a<ScrollView> {
        k() {
            super(0);
        }

        @Override // ym0.a
        public final ScrollView invoke() {
            return (ScrollView) ChatbotActivity.this.findViewById(C1987R.id.scrollview);
        }
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class l extends kotlin.jvm.internal.w implements ym0.a<ImageButton> {
        l() {
            super(0);
        }

        @Override // ym0.a
        public final ImageButton invoke() {
            return (ImageButton) ChatbotActivity.this.findViewById(C1987R.id.send_text);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class m implements bn0.d<Activity, Insight> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f32946a = nm0.h.b(new f0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f32947b;

        public m(Activity activity) {
            this.f32947b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.insight.android.entity.Insight, java.lang.Object] */
        @Override // bn0.d
        public final Insight getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f32946a.getValue();
        }
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class n extends kotlin.jvm.internal.w implements ym0.a<ConstraintLayout> {
        n() {
            super(0);
        }

        @Override // ym0.a
        public final ConstraintLayout invoke() {
            return (ConstraintLayout) ChatbotActivity.this.findViewById(C1987R.id.suggestion_layout);
        }
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class o extends kotlin.jvm.internal.w implements ym0.a<RadioGroup> {
        o() {
            super(0);
        }

        @Override // ym0.a
        public final RadioGroup invoke() {
            return (RadioGroup) ChatbotActivity.this.findViewById(C1987R.id.suggestion_radiogroup);
        }
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class p extends kotlin.jvm.internal.w implements ym0.a<TextInputLayout> {
        p() {
            super(0);
        }

        @Override // ym0.a
        public final TextInputLayout invoke() {
            return (TextInputLayout) ChatbotActivity.this.findViewById(C1987R.id.edit_text_layout);
        }
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class q extends kotlin.jvm.internal.w implements ym0.a<Toolbar> {
        q() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) ChatbotActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    /* compiled from: ChatbotActivity.kt */
    /* loaded from: classes3.dex */
    static final class r extends kotlin.jvm.internal.w implements ym0.a<FrameLayout> {
        r() {
            super(0);
        }

        @Override // ym0.a
        public final FrameLayout invoke() {
            return (FrameLayout) ChatbotActivity.this.findViewById(C1987R.id.webview_container);
        }
    }

    public static void A3(ChatbotActivity this$0, ValueAnimator it) {
        RecyclerView.l layoutManager;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(it, "it");
        FrameLayout h42 = this$0.h4();
        Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.u.h(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        h42.setPadding(h42.getPaddingLeft(), h42.getPaddingTop(), h42.getPaddingRight(), ((Integer) animatedValue).intValue());
        if (this$0.f32934z && (layoutManager = this$0.g4().getLayoutManager()) != null) {
            layoutManager.M0(this$0.f32929u.getItemCount() - 1);
        }
    }

    public static void B3(ChatbotActivity this$0, Conversation conversation) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(conversation, "$conversation");
        Editable text = this$0.j4().getText();
        if (text != null) {
            if (text.length() <= 0) {
                text = null;
            }
            if (text != null) {
                ay.b.p(this$0.j4());
                InputMetadata inputMetadata = conversation.getInputMetadata();
                if (inputMetadata != null) {
                    new p1(new com.withings.coach.chatbot.h(this$0, conversation), this$0).a(this$0.j4().getText().toString(), inputMetadata);
                }
            }
        }
    }

    public static void C3(ChatbotActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ArrayList arrayList = this$0.f32931w;
        if (arrayList != null) {
            Conversation conversation = this$0.A;
            if (conversation != null) {
                p0 p0Var = this$0.f32932x;
                if (p0Var != null) {
                    p0Var.M0(conversation, arrayList);
                    this$0.m4().setEnabled(false);
                    return;
                }
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
            kotlin.jvm.internal.u.s("currentConversation");
            throw null;
        }
    }

    public static final void D3(ChatbotActivity chatbotActivity, l0 l0Var) {
        String str;
        Map<String, String> d11;
        WebView webView = chatbotActivity.f32927s;
        if (webView != null) {
            webView.setWebViewClient(new com.withings.coach.chatbot.g(webView, chatbotActivity, l0Var));
            webView.getSettings().setJavaScriptEnabled(true);
            hm.d a11 = l0Var.a();
            if (a11 != null && (d11 = a11.d()) != null) {
                str = d11.get("url");
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            webView.loadUrl(str);
        }
    }

    public static final void E3(ChatbotActivity chatbotActivity, Conversation conversation, Suggestion suggestion) {
        chatbotActivity.n4().setVisibility(8);
        chatbotActivity.r4().setVisibility(8);
        chatbotActivity.o4().setVisibility(8);
        chatbotActivity.i4().setVisibility(8);
        chatbotActivity.l4().setVisibility(8);
        Button m42 = chatbotActivity.m4();
        m42.setText(suggestion.getText());
        m42.setEnabled(true);
        m42.setVisibility(0);
        ConstraintLayout p42 = chatbotActivity.p4();
        p42.setPadding(p42.getPaddingLeft(), chatbotActivity.getResources().getDimensionPixelSize(C1987R.dimen.basic2), p42.getPaddingRight(), p42.getPaddingBottom());
        chatbotActivity.A = conversation;
        chatbotActivity.f32931w = kotlin.collections.x.i0(suggestion);
    }

    public static final void F3(ChatbotActivity chatbotActivity, Conversation conversation, List list) {
        chatbotActivity.q4().removeAllViews();
        chatbotActivity.l4().setVisibility(0);
        chatbotActivity.i4().setVisibility(8);
        chatbotActivity.r4().setVisibility(8);
        chatbotActivity.o4().setVisibility(8);
        chatbotActivity.f32931w = new ArrayList();
        chatbotActivity.l4().getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView l42 = chatbotActivity.l4();
        l42.setHasFixedSize(false);
        l42.setLayoutManager(linearLayoutManager);
        i1 i1Var = chatbotActivity.f32930v;
        l42.setAdapter(i1Var);
        chatbotActivity.f32931w = new ArrayList();
        List<Suggestion> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
        for (Suggestion suggestion : list2) {
            arrayList.add(new m1(suggestion, chatbotActivity.f32933y));
        }
        i1Var.submitList(arrayList);
        Button m42 = chatbotActivity.m4();
        m42.setEnabled(false);
        m42.setText(C1987R.string._NEXT_);
        m42.setVisibility(0);
        chatbotActivity.A = conversation;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G3(com.withings.coach.chatbot.ChatbotActivity r6, com.withings.insight.android.entity.Conversation r7, java.util.List r8) {
        /*
            android.widget.ScrollView r0 = r6.n4()
            r1 = 0
            r0.setVisibility(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r6.r4()
            r2 = 8
            r0.setVisibility(r2)
            android.widget.ImageButton r0 = r6.o4()
            r0.setVisibility(r2)
            com.withings.coach.chatbot.DateTimePicker r0 = r6.i4()
            r0.setVisibility(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r6.l4()
            r0.setVisibility(r2)
            android.widget.Button r0 = r6.m4()
            r0.setEnabled(r1)
            r2 = 2132018639(0x7f1405cf, float:1.967559E38)
            r0.setText(r2)
            r0.setVisibility(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r6.p4()
            int r2 = r0.getPaddingLeft()
            int r3 = r0.getPaddingRight()
            int r4 = r0.getPaddingBottom()
            r0.setPadding(r2, r1, r3, r4)
            android.widget.RadioGroup r0 = r6.q4()
            r0.removeAllViews()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L56:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L108
            java.lang.Object r0 = r8.next()
            com.withings.insight.android.entity.Suggestion r0 = (com.withings.insight.android.entity.Suggestion) r0
            android.view.LayoutInflater r2 = r6.getLayoutInflater()
            android.widget.RadioGroup r3 = r6.q4()
            r4 = 2131560132(0x7f0d06c4, float:1.8745628E38)
            android.view.View r2 = r2.inflate(r4, r3, r1)
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.RadioButton"
            kotlin.jvm.internal.u.h(r2, r3)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            java.lang.String r3 = r0.getText()
            r2.setText(r3)
            android.widget.RadioGroup r3 = r6.q4()
            r3.addView(r2)
            android.content.Context r3 = r2.getContext()
            r4 = 2131296266(0x7f09000a, float:1.8210444E38)
            android.graphics.Typeface r3 = androidx.core.content.res.g.e(r4, r3)
            r2.setTypeface(r3)
            java.util.List r3 = r0.getActions()
            java.lang.String r4 = "refresh"
            if (r3 == 0) goto Lc3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r5 = r3 instanceof java.util.Collection
            if (r5 == 0) goto Lac
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto Lac
            goto Lfa
        Lac:
            java.util.Iterator r3 = r3.iterator()
        Lb0:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lfa
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = dp0.j.r(r5, r4, r1)
            if (r5 == 0) goto Lb0
            goto Lf3
        Lc3:
            java.util.List r3 = r0.getOnTapActionsWithConditions()
            if (r3 == 0) goto Lfa
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r5 = r3 instanceof java.util.Collection
            if (r5 == 0) goto Ld9
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto Ld9
            goto Lfa
        Ld9:
            java.util.Iterator r3 = r3.iterator()
        Ldd:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lfa
            java.lang.Object r5 = r3.next()
            com.withings.insight.android.entity.Action r5 = (com.withings.insight.android.entity.Action) r5
            java.lang.String r5 = r5.getAction()
            boolean r5 = dp0.j.r(r5, r4, r1)
            if (r5 == 0) goto Ldd
        Lf3:
            boolean r3 = r6.f32933y
            if (r3 != 0) goto Lf8
            goto Lfa
        Lf8:
            r3 = r1
            goto Lfb
        Lfa:
            r3 = 1
        Lfb:
            r2.setEnabled(r3)
            com.withings.coach.chatbot.d r3 = new com.withings.coach.chatbot.d
            r3.<init>(r1, r6, r0)
            r2.setOnClickListener(r3)
            goto L56
        L108:
            r6.A = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.coach.chatbot.ChatbotActivity.G3(com.withings.coach.chatbot.ChatbotActivity, com.withings.insight.android.entity.Conversation, java.util.List):void");
    }

    public static final void O3(ChatbotActivity chatbotActivity, Long l5) {
        chatbotActivity.getClass();
        if (l5 != null) {
            long longValue = l5.longValue();
            chatbotActivity.k4().l0(C1987R.id.fader_hidden);
            p0 p0Var = chatbotActivity.f32932x;
            if (p0Var != null) {
                p0Var.O0(longValue);
            } else {
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
        }
    }

    public static final void P3(ChatbotActivity chatbotActivity, int i11) {
        p0 p0Var = chatbotActivity.f32932x;
        if (p0Var != null) {
            p0Var.s1(i11);
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    public static final void Q3(ChatbotActivity chatbotActivity, DateTime dateTime) {
        chatbotActivity.f4("E', 'd' 'MMM' 'yyyy'", dateTime);
    }

    public static final void R3(ChatbotActivity chatbotActivity, DateTime dateTime) {
        chatbotActivity.f4("E', 'd' 'MMM' 'yyyy' 'hh:mm aa'", dateTime);
    }

    public static final void S3(ChatbotActivity chatbotActivity, DateTime dateTime) {
        chatbotActivity.f4("hh:mm aa", dateTime);
    }

    public static final void T3(ChatbotActivity chatbotActivity, Suggestion suggestion, boolean z5) {
        if (z5) {
            chatbotActivity.getClass();
            boolean unique = suggestion.getUnique();
            i1 i1Var = chatbotActivity.f32930v;
            if (unique) {
                chatbotActivity.f32931w = kotlin.collections.x.i0(suggestion);
                List<m1> currentList = i1Var.getCurrentList();
                kotlin.jvm.internal.u.i(currentList, "getCurrentList(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj : currentList) {
                    if (!((m1) obj).c().getUnique()) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((m1) it.next()).d(false);
                }
            } else {
                ArrayList arrayList2 = chatbotActivity.f32931w;
                if (arrayList2 != null) {
                    arrayList2.add(suggestion);
                }
                List<m1> currentList2 = i1Var.getCurrentList();
                kotlin.jvm.internal.u.i(currentList2, "getCurrentList(...)");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : currentList2) {
                    if (((m1) obj2).c().getUnique()) {
                        arrayList3.add(obj2);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    m1 m1Var = (m1) it2.next();
                    m1Var.d(false);
                    ArrayList arrayList4 = chatbotActivity.f32931w;
                    if (arrayList4 != null) {
                        arrayList4.remove(m1Var.c());
                    }
                }
            }
            i1Var.notifyItemRangeChanged(0, i1Var.getItemCount());
        } else {
            ArrayList arrayList5 = chatbotActivity.f32931w;
            if (arrayList5 != null) {
                arrayList5.remove(suggestion);
            }
        }
        Button m42 = chatbotActivity.m4();
        Collection collection = chatbotActivity.f32931w;
        if (collection == null) {
            collection = kotlin.collections.i0.f76187a;
        }
        m42.setEnabled(!collection.isEmpty());
    }

    public static final void W3(ChatbotActivity chatbotActivity, Conversation conversation) {
        chatbotActivity.s4();
        chatbotActivity.A = conversation;
        chatbotActivity.i4().setVisibility(0);
        chatbotActivity.i4().y(new c0(chatbotActivity));
    }

    public static final void X3(ChatbotActivity chatbotActivity, Conversation conversation) {
        chatbotActivity.s4();
        chatbotActivity.A = conversation;
        chatbotActivity.i4().setVisibility(0);
        chatbotActivity.i4().x(new d0(chatbotActivity));
    }

    public static final void Y3(ChatbotActivity chatbotActivity, Conversation conversation, List list) {
        int i11;
        Integer num;
        chatbotActivity.k4().l0(C1987R.id.suggestion_shown);
        chatbotActivity.l4().setVisibility(8);
        chatbotActivity.j4().requestFocus();
        TextInputLayout r42 = chatbotActivity.r4();
        InputMetadata inputMetadata = conversation.getInputMetadata();
        r42.setSuffixText((inputMetadata == null || (r2 = inputMetadata.getSuffix()) == null) ? "" : "");
        chatbotActivity.j4().setText("");
        chatbotActivity.r4().setVisibility(0);
        EditText j42 = chatbotActivity.j4();
        int intValue = ((Number) list.get(0)).intValue();
        if (list.size() > 1) {
            i11 = ((Number) list.get(1)).intValue();
        } else {
            i11 = 0;
        }
        j42.setInputType(intValue + i11);
        chatbotActivity.o4().setVisibility(0);
        chatbotActivity.m4().setVisibility(8);
        chatbotActivity.n4().setVisibility(8);
        chatbotActivity.i4().setVisibility(8);
        chatbotActivity.A = conversation;
        InputMetadata inputMetadata2 = conversation.getInputMetadata();
        nm0.y yVar = null;
        if (inputMetadata2 != null) {
            l1 c11 = new p1(null, chatbotActivity).c(inputMetadata2);
            if (c11 != null) {
                num = c11.c();
            } else {
                num = null;
            }
            if (num != null) {
                chatbotActivity.j4().setFilters(new c1[]{new c1(num.intValue())});
                yVar = nm0.y.f85009a;
            }
            if (yVar == null) {
                chatbotActivity.j4().setFilters(new InputFilter[0]);
            }
            yVar = nm0.y.f85009a;
        }
        if (yVar == null) {
            chatbotActivity.j4().setFilters(new InputFilter[0]);
        }
        chatbotActivity.o4().setOnClickListener(new com.withings.coach.chatbot.c(0, chatbotActivity, conversation));
    }

    public static final void Z3(ChatbotActivity chatbotActivity, Conversation conversation) {
        chatbotActivity.s4();
        chatbotActivity.A = conversation;
        chatbotActivity.i4().setVisibility(0);
        chatbotActivity.i4().z(new e0(chatbotActivity));
    }

    public static final void a4(final ChatbotActivity chatbotActivity) {
        if (chatbotActivity.p4().getHeight() > chatbotActivity.h4().getPaddingBottom()) {
            ValueAnimator valueAnimator = chatbotActivity.B;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(chatbotActivity.h4().getPaddingBottom(), chatbotActivity.p4().getHeight());
            ofInt.setDuration(250L);
            chatbotActivity.B = ofInt;
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withings.coach.chatbot.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ChatbotActivity.A3(ChatbotActivity.this, valueAnimator2);
                }
            });
            ofInt.start();
        }
    }

    public static final void b4(ChatbotActivity chatbotActivity, List list) {
        String str;
        View view;
        chatbotActivity.getClass();
        ArrayList S0 = kotlin.collections.x.S0(list);
        j0 j0Var = chatbotActivity.f32929u;
        j0Var.submitList(S0);
        l0 l0Var = (l0) kotlin.collections.x.U(list);
        String str2 = null;
        if (l0Var != null) {
            str = l0Var.f();
        } else {
            str = null;
        }
        if (kotlin.jvm.internal.u.e(str, "writing_bubble")) {
            j0Var.notifyItemRangeChanged(list.size() - 4, 3, "REMOVE_SMILEY_PAYLOAD");
        } else {
            l0 l0Var2 = (l0) kotlin.collections.x.U(list);
            if (l0Var2 != null) {
                str2 = l0Var2.f();
            }
            if (kotlin.jvm.internal.u.e(str2, "url_preview_bubble")) {
                j0Var.notifyItemRangeChanged(list.size() - 2, 1, "REMOVE_SMILEY_PAYLOAD");
            }
        }
        RecyclerView.z P = chatbotActivity.g4().P(j0Var.getItemCount() - 1);
        if (P != null && (view = P.itemView) != null) {
            if (androidx.core.view.u0.L(view) && !view.isLayoutRequested()) {
                int max = Math.max((chatbotActivity.g4().getPaddingBottom() - view.getHeight()) - chatbotActivity.getResources().getDimensionPixelSize(C1987R.dimen.layout4), 360);
                FrameLayout h42 = chatbotActivity.h4();
                h42.setPadding(h42.getPaddingLeft(), h42.getPaddingTop(), h42.getPaddingRight(), max);
                return;
            }
            view.addOnLayoutChangeListener(new g0(chatbotActivity));
        }
    }

    public static final void c4(ChatbotActivity chatbotActivity, String str) {
        Object obj;
        j0 j0Var = chatbotActivity.f32929u;
        List<l0> currentList = j0Var.getCurrentList();
        kotlin.jvm.internal.u.i(currentList, "getCurrentList(...)");
        Iterator<T> it = currentList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.u.e(((l0) obj).d(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        l0 l0Var = (l0) obj;
        if (l0Var != null) {
            j0Var.notifyItemRangeChanged(j0Var.getCurrentList().indexOf(l0Var), 1, "UPDATE_PREVIEW_PAYLOAD");
        }
    }

    public static final void d4(ChatbotActivity chatbotActivity, boolean z5) {
        if (z5) {
            chatbotActivity.q4().removeAllViews();
            chatbotActivity.k4().l0(C1987R.id.loading_shown);
            chatbotActivity.m4().setVisibility(8);
            chatbotActivity.p4().setBackgroundColor(0);
            chatbotActivity.n4().setVisibility(8);
            return;
        }
        chatbotActivity.p4().setBackgroundResource(C1987R.drawable.chatbot_suggestion_layout);
        chatbotActivity.k4().h0(C1987R.id.loading_shown, C1987R.id.suggestion_shown);
    }

    public static final void e4(ChatbotActivity chatbotActivity, boolean z5) {
        if (z5) {
            chatbotActivity.k4().l0(C1987R.id.suggestion_shown);
            return;
        }
        chatbotActivity.k4().l0(C1987R.id.only_conversation);
        chatbotActivity.q4().removeAllViews();
    }

    private final void f4(String str, DateTime dateTime) {
        p0 p0Var = this.f32932x;
        if (p0Var != null) {
            String abstractDateTime = dateTime.toString(str);
            long millis = dateTime.getMillis();
            kotlin.jvm.internal.u.g(abstractDateTime);
            List V = kotlin.collections.x.V(new Suggestion(HealthConstants.FoodIntake.UNIT_TYPE_NOT_DEFINED, abstractDateTime, null, null, null, false, null, Long.valueOf(millis), 44, null));
            Conversation conversation = this.A;
            if (conversation != null) {
                p0Var.M0(conversation, V);
                return;
            } else {
                kotlin.jvm.internal.u.s("currentConversation");
                throw null;
            }
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView g4() {
        Object value = this.f32915g.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (RecyclerView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout h4() {
        Object value = this.f32916h.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (FrameLayout) value;
    }

    private final DateTimePicker i4() {
        Object value = this.f32922n.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (DateTimePicker) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText j4() {
        Object value = this.f32923o.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (EditText) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MotionLayout k4() {
        return (MotionLayout) this.f32913e.getValue();
    }

    private final RecyclerView l4() {
        Object value = this.f32919k.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (RecyclerView) value;
    }

    private final Button m4() {
        Object value = this.f32920l.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (Button) value;
    }

    private final ScrollView n4() {
        Object value = this.f32921m.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (ScrollView) value;
    }

    private final ImageButton o4() {
        Object value = this.f32925q.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (ImageButton) value;
    }

    private final ConstraintLayout p4() {
        Object value = this.f32917i.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (ConstraintLayout) value;
    }

    private final RadioGroup q4() {
        Object value = this.f32918j.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (RadioGroup) value;
    }

    private final TextInputLayout r4() {
        Object value = this.f32924p.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (TextInputLayout) value;
    }

    private final void s4() {
        l4().setVisibility(8);
        r4().setVisibility(8);
        o4().setVisibility(8);
        m4().setVisibility(8);
        n4().setVisibility(8);
    }

    public static void z3(ChatbotActivity this$0, Suggestion suggestion) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(suggestion, "$suggestion");
        this$0.f32931w = kotlin.collections.x.i0(suggestion);
        this$0.m4().setEnabled(true);
    }

    @Override // com.withings.coach.chatbot.Hilt_ChatbotActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_chatbot);
        androidx.core.view.l1.a(getWindow(), false);
        getWindow().setStatusBarColor(ah.u.j(0.35f, ah.u.w(C1987R.attr.colorSurface, this, -65281)));
        ay.b.n(p4(), false, true, 23);
        nm0.g gVar = this.f32914f;
        Object value = gVar.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        ay.b.n((Toolbar) value, true, false, 29);
        Object value2 = gVar.getValue();
        kotlin.jvm.internal.u.i(value2, "getValue(...)");
        setSupportActionBar((Toolbar) value2);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w("");
            supportActionBar.p(true);
            supportActionBar.o(true);
            supportActionBar.s(y70.a.c(C1987R.drawable.icon_medium_navigation_close, this, ah.u.w(C1987R.attr.colorOnSurface, this, -65281)));
        }
        this.f32927s = new WebView(getApplicationContext());
        Object value3 = this.f32926r.getValue();
        kotlin.jvm.internal.u.i(value3, "getValue(...)");
        ((FrameLayout) value3).addView(this.f32927s);
        k4().h0(C1987R.id.only_conversation, C1987R.id.suggestion_shown);
        k4().N(new b0(this));
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.k(p4());
        bVar.q(n4().getId(), (int) (wq.a.g(this).y * 0.4f));
        bVar.e(p4());
        m4().setOnClickListener(new gi.e(this, 1));
        ay.b.n(g4(), true, true, 21);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        g4().setLayoutManager(linearLayoutManager);
        RecyclerView g42 = g4();
        j0 j0Var = this.f32929u;
        g42.setAdapter(j0Var);
        j0Var.registerAdapterDataObserver(new com.withings.coach.chatbot.i(this, linearLayoutManager));
        fn0.k<Object>[] kVarArr = M;
        fn0.k<Object> kVar = kVarArr[0];
        m mVar = this.f32928t;
        String insightId = ((Insight) mVar.getValue(this, kVar)).getCrmId();
        kotlin.jvm.internal.u.j(insightId, "insightId");
        Map i11 = kotlin.collections.s0.i(new nm0.j("insight_id", insightId));
        ri.a aVar = ri.a.f95046a;
        x70.b.l(aVar, "opened_conversation " + i11, new Object[0]);
        t0 t0Var = this.F;
        if (t0Var != null) {
            p0 a11 = t0Var.a((Insight) mVar.getValue(this, kVarArr[0]));
            xw.d.c(this, a11.V0(), new s(this));
            xw.d.c(this, a11.U0(), new t(a11));
            xw.d.c(this, a11.T0(), new u(this));
            xw.d.c(this, a11.c1(), new v(this));
            xw.d.c(this, a11.k1(), new w(this));
            xw.d.c(this, a11.l1(), new x(this));
            xw.d.c(this, a11.n1(), new y(this));
            xw.d.c(this, a11.m1(), new z(this));
            xw.d.d(this, a11.Z0(), new a0(this));
            xw.d.c(this, a11.q1(), new com.withings.coach.chatbot.j(this));
            xw.d.c(this, a11.a1(), new com.withings.coach.chatbot.k(this));
            xw.d.c(this, a11.d1(), new com.withings.coach.chatbot.l(this));
            xw.d.c(this, a11.W0(), new com.withings.coach.chatbot.m(this));
            xw.d.c(this, a11.X0(), new com.withings.coach.chatbot.n(this));
            xw.d.c(this, a11.i1(), new com.withings.coach.chatbot.o(this));
            xw.d.c(this, a11.g1(), new com.withings.coach.chatbot.p(this));
            xw.d.c(this, a11.o1(), new com.withings.coach.chatbot.q(this));
            xw.d.c(this, a11.e1(), new com.withings.coach.chatbot.r(this));
            this.f32932x = a11;
            Long insightId2 = ((Insight) mVar.getValue(this, kVarArr[0])).getInsightId();
            if (insightId2 != null) {
                long longValue = insightId2.longValue();
                k4().l0(C1987R.id.fader_hidden);
                p0 p0Var = this.f32932x;
                if (p0Var != null) {
                    p0Var.O0(longValue);
                    return;
                } else {
                    kotlin.jvm.internal.u.s("viewModel");
                    throw null;
                }
            }
            return;
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }

    @Override // com.withings.coach.chatbot.Hilt_ChatbotActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        WebView webView = this.f32927s;
        if (webView != null) {
            try {
                ViewParent parent = webView.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                webView.clearHistory();
                webView.loadUrl("about:blank");
                webView.onPause();
                webView.removeAllViews();
                webView.destroy();
                nm0.y yVar = nm0.y.f85009a;
            } catch (Throwable th2) {
                nm0.l.a(th2);
            }
        }
        this.f32927s = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
