--[[rscripts:analytics:start]]
task.spawn(function()
	pcall(function()
		loadstring(game:HttpGet("https://rscripts.net/api/telemetry/v2/client.lua?s=6a5a69e9ebcda6106e816395"))()
	end)
end)
--[[rscripts:analytics:end]]

loadstring(game:HttpGet("https://api.jnkie.com/api/v1/luascripts/public/b9c51052d7dd11ec62248e199f0d965d0b2d9e6eb1b688a38a29a8e28cb3e845/download"))()
