package com.withings.zendesk.ui;

import android.os.Bundle;
import androidx.lifecycle.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import r8.f;
/* compiled from: ArticlePageArgs.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/withings/zendesk/ui/ArticlePageArgs;", "Lr8/f;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroidx/lifecycle/u0;", "toSavedStateHandle", "()Landroidx/lifecycle/u0;", "", "component1", "()J", "articleId", "copy", "(J)Lcom/withings/zendesk/ui/ArticlePageArgs;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getArticleId", "<init>", "(J)V", "Companion", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ArticlePageArgs implements f {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long articleId;

    /* compiled from: ArticlePageArgs.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/withings/zendesk/ui/ArticlePageArgs$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/withings/zendesk/ui/ArticlePageArgs;", "fromBundle", "(Landroid/os/Bundle;)Lcom/withings/zendesk/ui/ArticlePageArgs;", "Landroidx/lifecycle/u0;", "savedStateHandle", "fromSavedStateHandle", "(Landroidx/lifecycle/u0;)Lcom/withings/zendesk/ui/ArticlePageArgs;", "<init>", "()V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final ArticlePageArgs fromBundle(Bundle bundle) {
            u.j(bundle, "bundle");
            bundle.setClassLoader(ArticlePageArgs.class.getClassLoader());
            if (bundle.containsKey("articleId")) {
                return new ArticlePageArgs(bundle.getLong("articleId"));
            }
            throw new IllegalArgumentException("Required argument \"articleId\" is missing and does not have an android:defaultValue");
        }

        public final ArticlePageArgs fromSavedStateHandle(u0 savedStateHandle) {
            u.j(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.b("articleId")) {
                Long l5 = (Long) savedStateHandle.c("articleId");
                if (l5 != null) {
                    return new ArticlePageArgs(l5.longValue());
                }
                throw new IllegalArgumentException("Argument \"articleId\" of type long does not support null values");
            }
            throw new IllegalArgumentException("Required argument \"articleId\" is missing and does not have an android:defaultValue");
        }

        private Companion() {
        }
    }

    public ArticlePageArgs(long j5) {
        this.articleId = j5;
    }

    public static /* synthetic */ ArticlePageArgs copy$default(ArticlePageArgs articlePageArgs, long j5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = articlePageArgs.articleId;
        }
        return articlePageArgs.copy(j5);
    }

    public static final ArticlePageArgs fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public static final ArticlePageArgs fromSavedStateHandle(u0 u0Var) {
        return Companion.fromSavedStateHandle(u0Var);
    }

    public final long component1() {
        return this.articleId;
    }

    public final ArticlePageArgs copy(long j5) {
        return new ArticlePageArgs(j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ArticlePageArgs) && this.articleId == ((ArticlePageArgs) obj).articleId) {
            return true;
        }
        return false;
    }

    public final long getArticleId() {
        return this.articleId;
    }

    public int hashCode() {
        return Long.hashCode(this.articleId);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong("articleId", this.articleId);
        return bundle;
    }

    public final u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        u0Var.e(Long.valueOf(this.articleId), "articleId");
        return u0Var;
    }

    public String toString() {
        return ah.a.c("ArticlePageArgs(articleId=", this.articleId, ")");
    }
}
