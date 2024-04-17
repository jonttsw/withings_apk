package com.withings.user.core.models;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: UserEvent.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/withings/user/core/models/UserEvent;", "", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/core/models/User;", "(Lcom/withings/user/core/models/User;)V", "getUser", "()Lcom/withings/user/core/models/User;", "Added", "Removed", "Updated", "Lcom/withings/user/core/models/UserEvent$Added;", "Lcom/withings/user/core/models/UserEvent$Removed;", "Lcom/withings/user/core/models/UserEvent$Updated;", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UserEvent {
    private final User user;

    /* compiled from: UserEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/withings/user/core/models/UserEvent$Added;", "Lcom/withings/user/core/models/UserEvent;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/core/models/User;", "(Lcom/withings/user/core/models/User;)V", "getUser", "()Lcom/withings/user/core/models/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Added extends UserEvent {
        private final User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Added(User user) {
            super(user, null);
            u.j(user, "user");
            this.user = user;
        }

        public static /* synthetic */ Added copy$default(Added added, User user, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                user = added.user;
            }
            return added.copy(user);
        }

        public final User component1() {
            return this.user;
        }

        public final Added copy(User user) {
            u.j(user, "user");
            return new Added(user);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Added) && u.e(this.user, ((Added) obj).user)) {
                return true;
            }
            return false;
        }

        @Override // com.withings.user.core.models.UserEvent
        public User getUser() {
            return this.user;
        }

        public int hashCode() {
            return this.user.hashCode();
        }

        public String toString() {
            User user = this.user;
            return "Added(user=" + user + ")";
        }
    }

    /* compiled from: UserEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/withings/user/core/models/UserEvent$Removed;", "Lcom/withings/user/core/models/UserEvent;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/core/models/User;", "(Lcom/withings/user/core/models/User;)V", "getUser", "()Lcom/withings/user/core/models/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Removed extends UserEvent {
        private final User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Removed(User user) {
            super(user, null);
            u.j(user, "user");
            this.user = user;
        }

        public static /* synthetic */ Removed copy$default(Removed removed, User user, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                user = removed.user;
            }
            return removed.copy(user);
        }

        public final User component1() {
            return this.user;
        }

        public final Removed copy(User user) {
            u.j(user, "user");
            return new Removed(user);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Removed) && u.e(this.user, ((Removed) obj).user)) {
                return true;
            }
            return false;
        }

        @Override // com.withings.user.core.models.UserEvent
        public User getUser() {
            return this.user;
        }

        public int hashCode() {
            return this.user.hashCode();
        }

        public String toString() {
            User user = this.user;
            return "Removed(user=" + user + ")";
        }
    }

    /* compiled from: UserEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/withings/user/core/models/UserEvent$Updated;", "Lcom/withings/user/core/models/UserEvent;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/core/models/User;", "(Lcom/withings/user/core/models/User;)V", "getUser", "()Lcom/withings/user/core/models/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Updated extends UserEvent {
        private final User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Updated(User user) {
            super(user, null);
            u.j(user, "user");
            this.user = user;
        }

        public static /* synthetic */ Updated copy$default(Updated updated, User user, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                user = updated.user;
            }
            return updated.copy(user);
        }

        public final User component1() {
            return this.user;
        }

        public final Updated copy(User user) {
            u.j(user, "user");
            return new Updated(user);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Updated) && u.e(this.user, ((Updated) obj).user)) {
                return true;
            }
            return false;
        }

        @Override // com.withings.user.core.models.UserEvent
        public User getUser() {
            return this.user;
        }

        public int hashCode() {
            return this.user.hashCode();
        }

        public String toString() {
            User user = this.user;
            return "Updated(user=" + user + ")";
        }
    }

    public /* synthetic */ UserEvent(User user, m mVar) {
        this(user);
    }

    public User getUser() {
        return this.user;
    }

    private UserEvent(User user) {
        this.user = user;
    }
}
