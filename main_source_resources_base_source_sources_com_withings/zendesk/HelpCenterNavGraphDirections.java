package com.withings.zendesk;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import r8.a;
import r8.l;
/* compiled from: HelpCenterNavGraphDirections.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/withings/zendesk/HelpCenterNavGraphDirections;", "", "()V", "Companion", "ShowArticle", "zendesk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HelpCenterNavGraphDirections {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: HelpCenterNavGraphDirections.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/withings/zendesk/HelpCenterNavGraphDirections$Companion;", "", "", "articleId", "Lr8/l;", "showArticle", "(J)Lr8/l;", "goToSearch", "()Lr8/l;", "<init>", "()V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final l goToSearch() {
            return new a(R.id.goToSearch);
        }

        public final l showArticle(long j5) {
            return new ShowArticle(j5);
        }

        private Companion() {
        }
    }

    /* compiled from: HelpCenterNavGraphDirections.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/withings/zendesk/HelpCenterNavGraphDirections$ShowArticle;", "Lr8/l;", "", "component1", "()J", "articleId", "copy", "(J)Lcom/withings/zendesk/HelpCenterNavGraphDirections$ShowArticle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getArticleId", "actionId", "I", "getActionId", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "arguments", "<init>", "(J)V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    private static final class ShowArticle implements l {
        private final int actionId = R.id.showArticle;
        private final long articleId;

        public ShowArticle(long j5) {
            this.articleId = j5;
        }

        public static /* synthetic */ ShowArticle copy$default(ShowArticle showArticle, long j5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j5 = showArticle.articleId;
            }
            return showArticle.copy(j5);
        }

        public final long component1() {
            return this.articleId;
        }

        public final ShowArticle copy(long j5) {
            return new ShowArticle(j5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof ShowArticle) && this.articleId == ((ShowArticle) obj).articleId) {
                return true;
            }
            return false;
        }

        @Override // r8.l
        public int getActionId() {
            return this.actionId;
        }

        @Override // r8.l
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putLong("articleId", this.articleId);
            return bundle;
        }

        public final long getArticleId() {
            return this.articleId;
        }

        public int hashCode() {
            return Long.hashCode(this.articleId);
        }

        public String toString() {
            return ah.a.c("ShowArticle(articleId=", this.articleId, ")");
        }
    }

    private HelpCenterNavGraphDirections() {
    }
}
