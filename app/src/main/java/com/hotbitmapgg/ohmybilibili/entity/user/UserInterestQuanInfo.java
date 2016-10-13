package com.hotbitmapgg.ohmybilibili.entity.user;

import java.util.List;

/**
 * Created by hcc on 2016/10/12 19:33
 * 100332338@qq.com
 * <p>
 * 用户详情兴趣圈模型类
 */

public class UserInterestQuanInfo
{

    /**
     * ts : 1474365557
     * code : 0
     * type : 4
     * data : {"total_count":1,"total_page":1,"result":[{"id":23,"name":"东方","desc":"东方Project 专题讨论&幻想乡住民的聚集地","thumb":"http://img.yo9.com/4b713fe0273211e6910600163e000cdb","post_count":479,"post_count_today":6,"is_join_community":1,"member_count":34500,"certification":0,"role_id":4,"post_nickname":"帖子","member_nickname":"乡民"}]}
     */

    private String ts;

    private int code;

    private int type;

    /**
     * total_count : 1
     * total_page : 1
     * result : [{"id":23,"name":"东方","desc":"东方Project 专题讨论&幻想乡住民的聚集地","thumb":"http://img.yo9.com/4b713fe0273211e6910600163e000cdb","post_count":479,"post_count_today":6,"is_join_community":1,"member_count":34500,"certification":0,"role_id":4,"post_nickname":"帖子","member_nickname":"乡民"}]
     */

    private DataBean data;

    public String getTs()
    {

        return ts;
    }

    public void setTs(String ts)
    {

        this.ts = ts;
    }

    public int getCode()
    {

        return code;
    }

    public void setCode(int code)
    {

        this.code = code;
    }

    public int getType()
    {

        return type;
    }

    public void setType(int type)
    {

        this.type = type;
    }

    public DataBean getData()
    {

        return data;
    }

    public void setData(DataBean data)
    {

        this.data = data;
    }

    public static class DataBean
    {

        private int total_count;

        private int total_page;

        /**
         * id : 23
         * name : 东方
         * desc : 东方Project 专题讨论&幻想乡住民的聚集地
         * thumb : http://img.yo9.com/4b713fe0273211e6910600163e000cdb
         * post_count : 479
         * post_count_today : 6
         * is_join_community : 1
         * member_count : 34500
         * certification : 0
         * role_id : 4
         * post_nickname : 帖子
         * member_nickname : 乡民
         */

        private List<ResultBean> result;

        public int getTotal_count()
        {

            return total_count;
        }

        public void setTotal_count(int total_count)
        {

            this.total_count = total_count;
        }

        public int getTotal_page()
        {

            return total_page;
        }

        public void setTotal_page(int total_page)
        {

            this.total_page = total_page;
        }

        public List<ResultBean> getResult()
        {

            return result;
        }

        public void setResult(List<ResultBean> result)
        {

            this.result = result;
        }

        public static class ResultBean
        {

            private int id;

            private String name;

            private String desc;

            private String thumb;

            private int post_count;

            private int post_count_today;

            private int is_join_community;

            private int member_count;

            private int certification;

            private int role_id;

            private String post_nickname;

            private String member_nickname;

            public int getId()
            {

                return id;
            }

            public void setId(int id)
            {

                this.id = id;
            }

            public String getName()
            {

                return name;
            }

            public void setName(String name)
            {

                this.name = name;
            }

            public String getDesc()
            {

                return desc;
            }

            public void setDesc(String desc)
            {

                this.desc = desc;
            }

            public String getThumb()
            {

                return thumb;
            }

            public void setThumb(String thumb)
            {

                this.thumb = thumb;
            }

            public int getPost_count()
            {

                return post_count;
            }

            public void setPost_count(int post_count)
            {

                this.post_count = post_count;
            }

            public int getPost_count_today()
            {

                return post_count_today;
            }

            public void setPost_count_today(int post_count_today)
            {

                this.post_count_today = post_count_today;
            }

            public int getIs_join_community()
            {

                return is_join_community;
            }

            public void setIs_join_community(int is_join_community)
            {

                this.is_join_community = is_join_community;
            }

            public int getMember_count()
            {

                return member_count;
            }

            public void setMember_count(int member_count)
            {

                this.member_count = member_count;
            }

            public int getCertification()
            {

                return certification;
            }

            public void setCertification(int certification)
            {

                this.certification = certification;
            }

            public int getRole_id()
            {

                return role_id;
            }

            public void setRole_id(int role_id)
            {

                this.role_id = role_id;
            }

            public String getPost_nickname()
            {

                return post_nickname;
            }

            public void setPost_nickname(String post_nickname)
            {

                this.post_nickname = post_nickname;
            }

            public String getMember_nickname()
            {

                return member_nickname;
            }

            public void setMember_nickname(String member_nickname)
            {

                this.member_nickname = member_nickname;
            }
        }
    }
}