// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package tv.periscope.android.api;

import java.util.List;

public class FetchUsersResponse
{

    public final String ownerId;
    public final List users;

    public FetchUsersResponse(String s, List list)
    {
        ownerId = s;
        users = list;
    }
}
