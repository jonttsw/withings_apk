package com.withings.coach.chatbot;

import android.view.View;
import com.withings.insight.android.entity.Conversation;
import com.withings.zendesk.ui.ArticleAdapter;
import tb0.v1;
import zendesk.support.Article;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32975a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f32976b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f32977c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f32975a = i11;
        this.f32976b = obj;
        this.f32977c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f32975a;
        Object obj = this.f32977c;
        Object obj2 = this.f32976b;
        switch (i11) {
            case 0:
                ChatbotActivity.B3((ChatbotActivity) obj2, (Conversation) obj);
                return;
            case 1:
                com.withings.wiscale2.device.wam02.ui.b.v1((com.withings.wiscale2.device.wam02.ui.b) obj2, (v1) obj);
                return;
            default:
                ArticleAdapter.d((ArticleAdapter) obj2, (Article) obj, view);
                return;
        }
    }
}
