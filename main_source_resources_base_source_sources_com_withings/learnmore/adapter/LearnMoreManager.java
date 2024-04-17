package com.withings.learnmore.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.withings.library.authentication.api.ConstantsWs;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import qm0.d;
import x70.b;
/* compiled from: LearnMore.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0013\b\u0007\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/withings/learnmore/adapter/LearnMoreManager;", "", "Lnm0/y;", "loadLearnMoreCategories", "()V", "Lcom/withings/learnmore/adapter/LearnMoreCategories;", "getLearnMoreCategories", "(Lqm0/d;)Ljava/lang/Object;", "learnMoreCategories", "saveLearnMoreCategories", "(Lcom/withings/learnmore/adapter/LearnMoreCategories;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/withings/learnmore/adapter/LearnMoreCategories;", "<init>", "(Landroid/content/Context;)V", "Companion", "learnmore_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LearnMoreManager {
    public static final String KEY_LEARN_MORE_JSON = "json";
    public static final String PREFS_NAME = "LearnMore";
    private final Context context;
    private LearnMoreCategories learnMoreCategories;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LearnMore.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/withings/learnmore/adapter/LearnMoreManager$Companion;", "", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lnm0/y;", "clearPrefs", "(Landroid/content/Context;)V", "", "KEY_LEARN_MORE_JSON", "Ljava/lang/String;", "PREFS_NAME", "<init>", "()V", "learnmore_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final void clearPrefs(Context context) {
            u.j(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(LearnMoreManager.PREFS_NAME, 0);
            u.i(sharedPreferences, "getSharedPreferences(...)");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.apply();
        }

        private Companion() {
        }
    }

    @Inject
    public LearnMoreManager(Context context) {
        u.j(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadLearnMoreCategories() {
        String string = this.context.getSharedPreferences(PREFS_NAME, 0).getString(KEY_LEARN_MORE_JSON, null);
        if (string != null) {
            try {
                this.learnMoreCategories = (LearnMoreCategories) new Gson().fromJson(string, (Class<Object>) LearnMoreCategories.class);
            } catch (Exception e11) {
                b.f(this, e11, "Unable to parse learn more categories", new Object[0]);
            }
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final Object getLearnMoreCategories(d<? super LearnMoreCategories> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new LearnMoreManager$getLearnMoreCategories$2(this, null), dVar);
    }

    public final void saveLearnMoreCategories(LearnMoreCategories learnMoreCategories) {
        u.j(learnMoreCategories, "learnMoreCategories");
        this.learnMoreCategories = learnMoreCategories;
        this.context.getSharedPreferences(PREFS_NAME, 0).edit().putString(KEY_LEARN_MORE_JSON, new Gson().toJson(learnMoreCategories)).apply();
    }
}
