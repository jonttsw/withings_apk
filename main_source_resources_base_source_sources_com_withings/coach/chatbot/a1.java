package com.withings.coach.chatbot;

import android.content.Context;
import android.view.View;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.activity.workout.ui.detail.k5;
import com.withings.wiscale2.activity.workout.ui.detail.l7;
import com.withings.zendesk.ui.PopularQuestionAdapter;
import zendesk.support.SimpleArticle;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32967a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f32968b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f32969c;

    public /* synthetic */ a1(int i11, Object obj, Object obj2) {
        this.f32967a = i11;
        this.f32968b = obj;
        this.f32969c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f32967a;
        Object obj = this.f32969c;
        Object obj2 = this.f32968b;
        switch (i11) {
            case 0:
                DateTimePicker.u((DateTimePicker) obj, (ym0.l) obj2);
                return;
            case 1:
                LineCellView.t((LineCellView) obj2, (LineCellView.a) obj);
                return;
            case 2:
                l7 previewInfo = (l7) obj;
                int i12 = k5.f49366g;
                kotlin.jvm.internal.u.j(previewInfo, "$previewInfo");
                ((Context) obj2).startActivity(previewInfo.b());
                return;
            case 3:
                hf0.a.T1((hf0.a) obj2, (LineCellView) obj);
                return;
            default:
                PopularQuestionAdapter.d((PopularQuestionAdapter) obj2, (SimpleArticle) obj, view);
                return;
        }
    }
}
