package com.withings.wiscale2.insight;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import bn0.d;
import com.withings.coach.chatbot.y0;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.timeline.data.TimelineItem;
import com.withings.webservices.legacy.withings.model.timeline.InsightItemData;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
import com.withings.webview.WebActivity;
import com.withings.wiscale2.C1987R;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
/* compiled from: InsightFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/insight/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class a extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private final b f57866c = new b(this);

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f57865e = {v.c(a.class, "insightItem", "getInsightItem()Lcom/withings/library/timeline/data/TimelineItem;", 0)};

    /* renamed from: d  reason: collision with root package name */
    public static final C0749a f57864d = new Object();

    /* compiled from: InsightFragment.kt */
    /* renamed from: com.withings.wiscale2.insight.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0749a {
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class b implements d<Fragment, TimelineItem<InsightItemData>> {

        /* renamed from: a  reason: collision with root package name */
        private final g f57867a = h.b(new com.withings.wiscale2.insight.b(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f57868b;

        public b(Fragment fragment) {
            this.f57868b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, com.withings.library.timeline.data.TimelineItem<com.withings.webservices.legacy.withings.model.timeline.InsightItemData>] */
        @Override // bn0.d
        public final TimelineItem<InsightItemData> getValue(Fragment fragment, k property) {
            Fragment thisRef = fragment;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f57867a.getValue();
        }
    }

    public static void s1(a this$0, InsightItemData insight) {
        u.j(this$0, "this$0");
        u.j(insight, "$insight");
        String lovedUrl = insight.lovedUrl;
        u.i(lovedUrl, "lovedUrl");
        this$0.v1(lovedUrl, ConstantsWs.CRM_EVENT_INSIGHT_LIKED);
    }

    public static void t1(a this$0, InsightItemData insight) {
        u.j(this$0, "this$0");
        u.j(insight, "$insight");
        String notLikedUrl = insight.notLikedUrl;
        u.i(notLikedUrl, "notLikedUrl");
        this$0.v1(notLikedUrl, ConstantsWs.CRM_EVENT_INSIGHT_NOTLIKED);
    }

    public static void u1(a this$0, InsightItemData insight) {
        u.j(this$0, "this$0");
        u.j(insight, "$insight");
        String whateverUrl = insight.whateverUrl;
        u.i(whateverUrl, "whateverUrl");
        this$0.v1(whateverUrl, ConstantsWs.CRM_EVENT_INSIGHT_WHATEVER);
    }

    private final void v1(String str, String str2) {
        InsightItemData insightItemData;
        String str3;
        TimelineItem<InsightItemData> value = this.f57866c.getValue(this, f57865e[0]);
        int i11 = rm.a.f95270b;
        InsightItemData insightItemData2 = null;
        if (value != null) {
            insightItemData = value.b();
        } else {
            insightItemData = null;
        }
        if (insightItemData instanceof WsTimelineItemData) {
            insightItemData2 = insightItemData;
        }
        if (insightItemData2 != null && (str3 = insightItemData2.crmId) != null) {
            rm.a.a(str2, str3);
        }
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context requireContext = requireContext();
        u.i(requireContext, "requireContext(...)");
        Intent putExtra = aVar.c(requireContext, getString(C1987R.string._WITHINGS_INSIGHTS_), str).putExtra(WebActivity.EXTRA_ALLOW_BACK, false);
        u.i(putExtra, "putExtra(...)");
        startActivity(putExtra);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_insight, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InsightItemData b10;
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        TimelineItem<InsightItemData> value = this.f57866c.getValue(this, f57865e[0]);
        if (value != null && (b10 = value.b()) != null) {
            TextView textView = (TextView) view.findViewById(C1987R.id.title);
            String str = b10.text1;
            if (str != null) {
                textView.setText(androidx.core.text.b.b(str));
            }
            TextView textView2 = (TextView) view.findViewById(C1987R.id.body);
            String str2 = b10.text2;
            if (str2 != null) {
                textView2.setText(androidx.core.text.b.b(str2));
            }
            TextView textView3 = (TextView) view.findViewById(C1987R.id.glyph);
            String str3 = b10.glyphName;
            if (str3 != null) {
                Context requireContext = requireContext();
                u.i(requireContext, "requireContext(...)");
                textView3.setText(wq.a.f(requireContext, str3));
            }
            ((LinearLayout) view.findViewById(C1987R.id.loved)).setOnClickListener(new pq.d(5, this, b10));
            ((LinearLayout) view.findViewById(C1987R.id.whatever)).setOnClickListener(new y0(4, this, b10));
            ((LinearLayout) view.findViewById(C1987R.id.notliked)).setOnClickListener(new sg.a(4, this, b10));
        }
    }
}
