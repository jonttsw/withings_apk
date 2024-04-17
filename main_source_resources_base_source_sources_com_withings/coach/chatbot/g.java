package com.withings.coach.chatbot;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* compiled from: ChatbotActivity.kt */
/* loaded from: classes3.dex */
public final class g extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WebView f32993a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ChatbotActivity f32994b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l0 f32995c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(WebView webView, ChatbotActivity chatbotActivity, l0 l0Var) {
        this.f32993a = webView;
        this.f32994b = chatbotActivity;
        this.f32995c = l0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        kotlin.jvm.internal.u.j(view, "view");
        kotlin.jvm.internal.u.j(url, "url");
        super.onPageFinished(view, url);
        final ChatbotActivity chatbotActivity = this.f32994b;
        final l0 l0Var = this.f32995c;
        this.f32993a.evaluateJavascript("(function() { return document.getElementsByTagName('html')[0].outerHTML;})();", new ValueCallback() { // from class: com.withings.coach.chatbot.f
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                p0 p0Var;
                String str = (String) obj;
                ChatbotActivity this$0 = ChatbotActivity.this;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                l0 chatbotItemData = l0Var;
                kotlin.jvm.internal.u.j(chatbotItemData, "$chatbotItemData");
                p0Var = this$0.f32932x;
                if (p0Var != null) {
                    kotlin.jvm.internal.u.g(str);
                    p0Var.v1(chatbotItemData, str);
                    return;
                }
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
        });
    }
}
