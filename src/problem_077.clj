(fn anafind [xs] (set (map set (filter #(> (count %) 1) (vals (group-by sort xs))))))