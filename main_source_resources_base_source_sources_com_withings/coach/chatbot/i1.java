package com.withings.coach.chatbot;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.withings.insight.android.entity.Suggestion;
import com.withings.wiscale2.C1987R;
/* compiled from: MultipleChoiceSuggestionsAdapter.kt */
/* loaded from: classes3.dex */
public final class i1 extends androidx.recyclerview.widget.u<m1, a> {

    /* renamed from: a  reason: collision with root package name */
    private final ym0.p<Suggestion, Boolean, nm0.y> f33008a;

    /* compiled from: MultipleChoiceSuggestionsAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class a extends RecyclerView.z {

        /* renamed from: a  reason: collision with root package name */
        private final CheckBox f33009a;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(C1987R.id.suggestion_checkbox);
            kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
            this.f33009a = (CheckBox) findViewById;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
            if (r7.b() == false) goto L19;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(final com.withings.coach.chatbot.m1 r7, final ym0.p<? super com.withings.insight.android.entity.Suggestion, ? super java.lang.Boolean, nm0.y> r8) {
            /*
                r6 = this;
                java.lang.String r0 = "onSuggestionChecked"
                kotlin.jvm.internal.u.j(r8, r0)
                com.withings.insight.android.entity.Suggestion r0 = r7.c()
                java.lang.String r1 = r0.getText()
                android.widget.CheckBox r2 = r6.f33009a
                r2.setText(r1)
                android.content.Context r1 = r2.getContext()
                r3 = 2131296266(0x7f09000a, float:1.8210444E38)
                android.graphics.Typeface r1 = androidx.core.content.res.g.e(r3, r1)
                r2.setTypeface(r1)
                r1 = 0
                r2.setOnCheckedChangeListener(r1)
                java.util.List r1 = r0.getActions()
                if (r1 == 0) goto L59
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r3 = r1 instanceof java.util.Collection
                if (r3 == 0) goto L3a
                r3 = r1
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L3a
                goto L59
            L3a:
                java.util.Iterator r1 = r1.iterator()
            L3e:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L59
                java.lang.Object r3 = r1.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r4 = "refresh"
                r5 = 0
                boolean r3 = dp0.j.r(r3, r4, r5)
                if (r3 == 0) goto L3e
                boolean r1 = r7.b()
                if (r1 != 0) goto L5a
            L59:
                r5 = 1
            L5a:
                r2.setEnabled(r5)
                boolean r1 = r7.a()
                r2.setChecked(r1)
                com.withings.coach.chatbot.h1 r1 = new com.withings.coach.chatbot.h1
                r1.<init>()
                r2.setOnCheckedChangeListener(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.coach.chatbot.i1.a.a(com.withings.coach.chatbot.m1, ym0.p):void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i1(ym0.p<? super Suggestion, ? super Boolean, nm0.y> pVar) {
        super(new m.f());
        this.f33008a = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z zVar, int i11) {
        a holder = (a) zVar;
        kotlin.jvm.internal.u.j(holder, "holder");
        m1 item = getItem(i11);
        kotlin.jvm.internal.u.i(item, "getItem(...)");
        holder.a(item, this.f33008a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(C1987R.layout.suggestion_checkbox, parent, false);
        kotlin.jvm.internal.u.i(inflate, "inflate(...)");
        return new a(inflate);
    }
}
