<h2><a href="https://leetcode.com/problems/sliding-window-maximum/">239. Sliding Window Maximum</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an array of integers&nbsp;<code style="user-select: auto;">nums</code>, there is a sliding window of size <code style="user-select: auto;">k</code> which is moving from the very left of the array to the very right. You can only see the <code style="user-select: auto;">k</code> numbers in the window. Each time the sliding window moves right by one position.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the max sliding window</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,3,-1,-3,5,3,6,7], k = 3
<strong style="user-select: auto;">Output:</strong> [3,3,5,5,6,7]
<strong style="user-select: auto;">Explanation:</strong> 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       <strong style="user-select: auto;">3</strong>
 1 [3  -1  -3] 5  3  6  7       <strong style="user-select: auto;">3</strong>
 1  3 [-1  -3  5] 3  6  7      <strong style="user-select: auto;"> 5</strong>
 1  3  -1 [-3  5  3] 6  7       <strong style="user-select: auto;">5</strong>
 1  3  -1  -3 [5  3  6] 7       <strong style="user-select: auto;">6</strong>
 1  3  -1  -3  5 [3  6  7]      <strong style="user-select: auto;">7</strong>
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1], k = 1
<strong style="user-select: auto;">Output:</strong> [1]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">4</sup> &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= nums.length</code></li>
</ul>
</div>