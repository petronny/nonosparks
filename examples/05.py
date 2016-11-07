import json
example='05'
data={}
data['width']=3
data['height']=1
data['hints']={}
data['hints']['vertical']=['1 1']
data['answer']=[]
data['answer'].append([1,0,1])
json.dump(data,open('examples/'+example+'.json','w'))
