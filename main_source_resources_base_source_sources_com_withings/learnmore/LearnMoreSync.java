package com.withings.learnmore;

import android.content.Context;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.withings.learnmore.adapter.LearnMoreCategories;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import vh.a;
import x70.b;
/* compiled from: LearnMoreSync.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/withings/learnmore/LearnMoreSync;", "Lvh/a;", "Lnm0/y;", "run", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/withings/learnmore/adapter/LearnMoreManager;", "learnMoreManager", "Lcom/withings/learnmore/adapter/LearnMoreManager;", "getLearnMoreManager", "()Lcom/withings/learnmore/adapter/LearnMoreManager;", "<init>", "(Landroid/content/Context;)V", "learnmore_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LearnMoreSync implements a {
    public static final int $stable = 8;
    private final Context context;
    private final LearnMoreManager learnMoreManager;

    public LearnMoreSync(Context context) {
        u.j(context, "context");
        this.context = context;
        this.learnMoreManager = new LearnMoreManager(context);
    }

    public boolean equals(Object obj) {
        return obj instanceof LearnMoreSync;
    }

    public final Context getContext() {
        return this.context;
    }

    public final LearnMoreManager getLearnMoreManager() {
        return this.learnMoreManager;
    }

    public int hashCode() {
        return 0;
    }

    @Override // vh.a
    public void run() {
        try {
            Response execute = new OkHttpClient().newCall(new Request.Builder().url(this.context.getString(C1987R.string._JSON_LEARN_MORE_URL_)).build()).execute();
            if (execute.isSuccessful()) {
                LearnMoreCategories learnMoreCategories = (LearnMoreCategories) new Gson().fromJson(execute.body().string(), (Class<Object>) LearnMoreCategories.class);
                LearnMoreManager learnMoreManager = this.learnMoreManager;
                u.g(learnMoreCategories);
                learnMoreManager.saveLearnMoreCategories(learnMoreCategories);
                return;
            }
            int code = execute.code();
            String message = execute.message();
            throw new IOException("Unable to fetch learn more json : " + code + " " + message);
        } catch (Exception e11) {
            b.f(this, e11, "Unable to fetch learn more json", new Object[0]);
        }
    }
}
