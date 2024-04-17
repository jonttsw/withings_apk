package com.withings.features.platform.model;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.d0;
import androidx.room.h0;
import androidx.room.k;
import com.withings.features.platform.api.Tag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pm.b;
import x8.a;
import z8.f;
/* loaded from: classes3.dex */
public final class PlatformTagDao_ProdRoomDb_Impl implements PlatformTagDao {
    private final b __commonRoomConverter = new b();
    private final RoomDatabase __db;
    private final k<Tag> __insertionAdapterOfTag;
    private final h0 __preparedStmtOfClear;

    public PlatformTagDao_ProdRoomDb_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfTag = new k<Tag>(roomDatabase) { // from class: com.withings.features.platform.model.PlatformTagDao_ProdRoomDb_Impl.1
            @Override // androidx.room.h0
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `Tag` (`ownerId`,`ownerType`,`tags`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.k
            public void bind(f fVar, Tag tag) {
                fVar.v(1, tag.getOwnerId());
                fVar.s(2, tag.getOwnerType());
                b bVar = PlatformTagDao_ProdRoomDb_Impl.this.__commonRoomConverter;
                List<String> tags = tag.getTags();
                bVar.getClass();
                fVar.s(3, b.b(tags));
            }
        };
        this.__preparedStmtOfClear = new h0(roomDatabase) { // from class: com.withings.features.platform.model.PlatformTagDao_ProdRoomDb_Impl.2
            @Override // androidx.room.h0
            public String createQuery() {
                return "delete from Tag";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.withings.features.platform.model.PlatformTagDao
    public void clear() {
        this.__db.b();
        f acquire = this.__preparedStmtOfClear.acquire();
        try {
            this.__db.c();
            acquire.H();
            this.__db.z();
            this.__db.h();
        } finally {
            this.__preparedStmtOfClear.release(acquire);
        }
    }

    @Override // com.withings.features.platform.model.PlatformTagDao
    public List<Tag> getAllTags() {
        d0 c11 = d0.c(0, "select * from Tag");
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "ownerId");
            int b11 = a.b(c12, "ownerType");
            int b12 = a.b(c12, "tags");
            ArrayList arrayList = new ArrayList(c12.getCount());
            while (c12.moveToNext()) {
                long j5 = c12.getLong(b10);
                String string = c12.getString(b11);
                String string2 = c12.getString(b12);
                this.__commonRoomConverter.getClass();
                arrayList.add(new Tag(j5, string, b.g(string2)));
            }
            return arrayList;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.features.platform.model.PlatformTagDao
    public List<Tag> getByOwner(String str, long j5) {
        d0 c11 = d0.c(2, "select * from Tag where ownerType = ? and ownerId = ?");
        c11.s(1, str);
        c11.v(2, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "ownerId");
            int b11 = a.b(c12, "ownerType");
            int b12 = a.b(c12, "tags");
            ArrayList arrayList = new ArrayList(c12.getCount());
            while (c12.moveToNext()) {
                long j11 = c12.getLong(b10);
                String string = c12.getString(b11);
                String string2 = c12.getString(b12);
                this.__commonRoomConverter.getClass();
                arrayList.add(new Tag(j11, string, b.g(string2)));
            }
            return arrayList;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.features.platform.model.PlatformTagDao
    public Tag hasTagEnabled(String str, long j5, String str2) {
        Tag tag;
        d0 c11 = d0.c(3, "select * from Tag where ownerType = ? and ownerId = ? and tags like ?");
        c11.s(1, str);
        c11.v(2, j5);
        c11.s(3, str2);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "ownerId");
            int b11 = a.b(c12, "ownerType");
            int b12 = a.b(c12, "tags");
            if (c12.moveToFirst()) {
                long j11 = c12.getLong(b10);
                String string = c12.getString(b11);
                String string2 = c12.getString(b12);
                this.__commonRoomConverter.getClass();
                tag = new Tag(j11, string, b.g(string2));
            } else {
                tag = null;
            }
            return tag;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.features.platform.model.PlatformTagDao
    public void insert(List<Tag> list) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfTag.insert(list);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }
}
