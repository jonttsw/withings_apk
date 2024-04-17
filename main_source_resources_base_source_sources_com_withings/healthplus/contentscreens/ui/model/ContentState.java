package com.withings.healthplus.contentscreens.ui.model;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: ContentState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentState;", "", "()V", "Error", "Loaded", "Loading", "Lcom/withings/healthplus/contentscreens/ui/model/ContentState$Error;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentState$Loaded;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentState$Loading;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ContentState {
    public static final int $stable = 0;

    /* compiled from: ContentState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentState$Error;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Error extends ContentState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return true;
        }

        public int hashCode() {
            return 224565023;
        }

        public String toString() {
            return "Error";
        }
    }

    /* compiled from: ContentState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentState$Loaded;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentState;", "content", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi;", "(Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi;)V", "getContent", "()Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Loaded extends ContentState {
        public static final int $stable = 0;
        private final ContentScreenUi content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(ContentScreenUi content) {
            super(null);
            u.j(content, "content");
            this.content = content;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ContentScreenUi contentScreenUi, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                contentScreenUi = loaded.content;
            }
            return loaded.copy(contentScreenUi);
        }

        public final ContentScreenUi component1() {
            return this.content;
        }

        public final Loaded copy(ContentScreenUi content) {
            u.j(content, "content");
            return new Loaded(content);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Loaded) && u.e(this.content, ((Loaded) obj).content)) {
                return true;
            }
            return false;
        }

        public final ContentScreenUi getContent() {
            return this.content;
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            ContentScreenUi contentScreenUi = this.content;
            return "Loaded(content=" + contentScreenUi + ")";
        }
    }

    /* compiled from: ContentState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentState$Loading;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Loading extends ContentState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return true;
        }

        public int hashCode() {
            return -1420706669;
        }

        public String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ ContentState(m mVar) {
        this();
    }

    private ContentState() {
    }
}
